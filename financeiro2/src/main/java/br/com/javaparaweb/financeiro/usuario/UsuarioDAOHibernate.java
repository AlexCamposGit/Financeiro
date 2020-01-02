package br.com.javaparaweb.financeiro.usuario;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Query;

public class UsuarioDAOHibernate implements UsuarioDAO {
   
	private Session session;
    public void setSession(Session session) {
    	this.session = session;
    }
	
	public UsuarioDAOHibernate() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void salvar(Usuario usuario) {
		// TODO Auto-generated method stub

	}

	@Override
	public void atualizar(Usuario usuario) {
		// TODO Auto-generated method stub

	}

	@Override
	public void excluir(Usuario usuario) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Usuario> listar() {
		return this.session.createCriteria(Usuario.class).list();
	}

	@Override
	public Usuario carregar(Integer codigo) {
		return (Usuario) this.session.get(Usuario.class, codigo);	
	}

	@Override
	public Usuario buscaPorLogin(String login) {
		String hql = "select u from Usuario u where u.login = :login";
        Query consulta = this.session.createQuery(hql);
        consulta.setString("login", login);
        return(Usuario) consulta.uniqueResult();
	}
}
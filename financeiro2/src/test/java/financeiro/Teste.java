package financeiro;

import br.com.javaparaweb.financeiro.usuario.Usuario;
import br.com.javaparaweb.financeiro.usuario.UsuarioDAOHibernate;
public class Teste {

	public static void main(String[] args) {

		Usuario usuario = new Usuario();
		usuario.setCodigo(1);  
		usuario.setNome("Alex");
		usuario.setEmail("alex@google.com.br");
		usuario.setLogin("Login_Alex");
		usuario.setSenha("147258");
		usuario.setConfirmarsenha("147258");
		usuario.setNascimento(null);
		usuario.setCelular("984623187");
		usuario.setIdioma("Portugues");
		usuario.setAtivo(true);	
		
		UsuarioDAOHibernate usuarioDAOHibernate =new UsuarioDAOHibernate();
		usuarioDAOHibernate.salvar(usuario);		
	}

}

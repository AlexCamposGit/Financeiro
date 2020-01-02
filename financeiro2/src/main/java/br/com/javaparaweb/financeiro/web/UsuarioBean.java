package br.com.javaparaweb.financeiro.web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.application.FacesMessage;

import br.com.javaparaweb.financeiro.usuario.Usuario;
import br.com.javaparaweb.financeiro.usuario.UsuarioRN;

@ManagedBean(name="usuarioBean")
@ViewScoped
public class UsuarioBean {

	private Usuario usuario = new Usuario();
	private String confirmaSenha;

	public String novo() {
		this.usuario = new Usuario();
		this.usuario.setAtivo(true);
		System.out.println("Passou");
		return "publico/usuario";
	}

	public String salvar() {
		FacesContext context = FacesContext.getCurrentInstance();

		String senha = this.usuario.getSenha();
		if (!senha.equals(this.confirmaSenha)) {
			FacesMessage facesMesage = new FacesMessage("A senha n�o foi confirmada corretamente!");
			context.addMessage(null, facesMesage);
			return null;
		}
		UsuarioRN usuarioRN = new UsuarioRN();
		usuarioRN.salvar(this.usuario);
		return "usuariosucesso";
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getConfirmaSenha() {
		return confirmaSenha;
	}

	public void setConfirmaSenha(String confirmaSenha) {
		this.confirmaSenha = confirmaSenha;
	}
}
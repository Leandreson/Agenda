package controler;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import model.Usuario;

@ManagedBean(name="UsuarioBean")
@ViewScoped
public class UsuarioBean {

	Usuario usuario;
	List<Usuario> Usuarios;
	
	public UsuarioBean() {
		// TODO Auto-generated constructor stub
		usuario = new Usuario();
		Usuarios = new ArrayList<Usuario>();
	}

	public void logar(){
		System.out.println("\n\n\nESTOU FAZENDO LOGIN AGORA\nNOME: "+usuario.getLogin()+"\nSENHA: "+usuario.getSenha());
		/*addMessage("Usuário logado com Sucesso!!!");*/
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"","Usuário logado com Sucesso!!!"));
	}
	public void adddMessage(String summary) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,summary,null);
		FacesContext.getCurrentInstance().addMessage(null, message);
	}
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}

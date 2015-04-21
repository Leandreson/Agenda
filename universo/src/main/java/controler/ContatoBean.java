package controler;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

@ManagedBean(name = "ContatoBean")
@ViewScoped
public class ContatoBean{
	
	
	 	private boolean value1;   
	    private boolean value2;

	    
	    public ContatoBean() {
	    	// TODO Auto-generated constructor stub
	    }	    
	    
	    @PostConstruct
	    public void inicializar(){
	    	value1=new Boolean(true);
	    	value2=new Boolean(false);
	    }
	    

	    public boolean isValue1() {
	        return value1;
	    }
	 
	    public void setValue1(boolean value1) {
	        this.value1 = value1;
	    }
	 
	    public boolean isValue2() {
	        return value2;
	    }
	 
	    public void setValue2(boolean value2) {
	        this.value2 = value2;
	    }
	     
	    public void teste() {
	    	System.out.print("VALUE1: ");
			System.out.println(this.isValue1());
			System.out.print("VALUE2: ");
			System.out.println(this.isValue2());
		}
	    public void addMessage() {
	        String summary = value2 ? "Checked" : "Unchecked";
	        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(summary));
	        teste();
	    }
}

/**
 * 
 */
package br.com.foursys.locadora.util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 * @author curitiba01
 *
 */
public class JSFUtil {
	
	
	
	
	public static void addErrorMenssage(String msg) {
		
		
		FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, msg,msg);
		
		FacesContext facesContext = FacesContext.getCurrentInstance();
		
		facesContext.addMessage(msg, facesMessage);
		
	}
	
public static void addInforMenssage(String msg) {
		
		
		FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, msg,msg);
		
		FacesContext facesContext = FacesContext.getCurrentInstance();
		
		facesContext.addMessage(msg, facesMessage);
		
	}

}

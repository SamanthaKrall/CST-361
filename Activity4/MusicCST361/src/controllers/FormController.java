package controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import beans.Song;
import beans.User;
import business.BusinessInterface;

@ManagedBean
public class FormController {
	@Inject
	BusinessInterface services;
	
	public String onSubmit() {
		FacesContext context = FacesContext.getCurrentInstance();
		User user = context.getApplication().evaluateExpressionGet(context, "#{user}", User.class);
		services.test();
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("user", user);
		//System.out.println("You clicked the Submit button"); //testing
		//System.out.println("The first name is " + user.getFirstname()); //testing
		return "Response.xhtml";
	}
	
	public BusinessInterface getService() {
		
		return services;
	}
	public String add() {
		FacesContext context = FacesContext.getCurrentInstance();
		Song song = context.getApplication().evaluateExpressionGet(context, "#{song}", Song.class);
		services.test();
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("song", song);
		
		System.out.println("You clicked Add");
		return "Add.xhtml";		
	}
	public String details() {
		FacesContext context = FacesContext.getCurrentInstance();
		Song song = context.getApplication().evaluateExpressionGet(context, "#{song}", Song.class);
		services.test();
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("song", song);
		System.out.println("You clicked Details");
		return "Details.xhtml";
	}
}

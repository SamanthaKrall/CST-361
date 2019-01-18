package controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import beans.User;
import business.WeatherBusinessInterface;

@ManagedBean
public class FormController {
	@Inject
	WeatherBusinessInterface services;
	
	public String onSubmit() {
		//get user values Managed Bean
		FacesContext context = FacesContext.getCurrentInstance();
		User user = context.getApplication().evaluateExpressionGet(context, "#{user}", User.class);
		
		//prints a message to the console to tell us which business service is currently selected
		services.test();
		
		//put the user object into the POST request, Forward to test response view along with the User Managed Bean
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("user", user);
		
		
		//testing
		//System.out.println("You clicked the submit button");
		//System.out.println("The User ID is " + user.getUserID());
		//show the next page
		return "Response.xhtml";
	}
	
	public WeatherBusinessInterface getService() {
		return services;
		
	}
}

package br.com.housecode.config;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.faces.context.FacesContext;

public class Producers {
	
	@Produces
	@RequestScoped
	public FacesContext getFacexContext() {
		return FacesContext.getCurrentInstance();
	}

}

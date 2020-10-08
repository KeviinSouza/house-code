package br.com.housecode.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.housecode.models.Autor;

@FacesConverter("autorConverter")
public class AutorConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String id) {
		
		if(id == null || id.trim().isBlank()){
			return null;
		}
		
		Autor autor = new Autor();
		autor.setId(Integer.valueOf(id));
		
		return autor;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object autorObject) {
		
		if(autorObject == null) {
			return null;
		}
		
		Autor autor = (Autor) autorObject;
		String autorString = autor.getId().toString();
		return autorString;
	}

}

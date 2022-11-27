package br.com.henrique.Converter;

import br.com.henrique.entidade.Modelo;
import org.springframework.stereotype.Component;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

@Component
public class ModeloConverter implements Converter{

   public Modelo convert(final String modelo){
       return new Modelo();
   }

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String value) {
        return null;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object value) {
        return null;
    }
}

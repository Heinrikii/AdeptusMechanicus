package br.com.henrique.Converter;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

@FacesConverter("anoDate")
public class AnoDateConverter implements Converter {

    private static final DateFormat FORMAT =
            new SimpleDateFormat("YYYY");

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        Date dataConvertida = null;

        if (value == null || value.equals("")){
            return null;
        }
        else{
            try {
                dataConvertida = FORMAT.parse(value);
            } catch (ParseException e) {
                throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR,
                        "Data Incorreta", "Informe uma data correta"));
            }
        }
        return dataConvertida;
    }

    private Calendar getDataAtual(){
        Calendar dataAtual = new GregorianCalendar();

        dataAtual.set(Calendar.HOUR_OF_DAY, 0);
        dataAtual.set(Calendar.MINUTE, 0);
        dataAtual.set(Calendar.SECOND, 0);
        dataAtual.set(Calendar.MILLISECOND, 0);

        return dataAtual;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        return FORMAT.format((Date) value);
    }
}

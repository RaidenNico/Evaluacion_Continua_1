package pe.edu.idat.dsw1soapJ19;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MyResponse {
    private String translatedDayOfWeek;
    
    public String getTranslatedDayOfWeek() {
        return translatedDayOfWeek;
    }
    
    public void setTranslatedDayOfWeek(String translatedDayOfWeek) {
        this.translatedDayOfWeek = translatedDayOfWeek;
    }
}

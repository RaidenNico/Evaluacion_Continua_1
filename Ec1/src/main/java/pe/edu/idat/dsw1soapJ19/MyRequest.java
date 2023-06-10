package pe.edu.idat.dsw1soapJ19;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MyRequest {
    private String dayOfWeek;
    
    public String getDayOfWeek() {
        return dayOfWeek;
    }
    
    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
}

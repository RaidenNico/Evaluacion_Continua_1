package pe.edu.idat.dsw1soapJ19;

import java.util.HashMap;
import java.util.Map;

public class DayTranslator {
    private static final Map<String, String> SPANISH_TO_ENGLISH = new HashMap<>();
    
    static {
        SPANISH_TO_ENGLISH.put("lunes", "monday");
        SPANISH_TO_ENGLISH.put("martes", "tuesday");
        SPANISH_TO_ENGLISH.put("miércoles", "wednesday");
        SPANISH_TO_ENGLISH.put("jueves", "thursday");
        SPANISH_TO_ENGLISH.put("viernes", "friday");
        SPANISH_TO_ENGLISH.put("sábado", "saturday");
        SPANISH_TO_ENGLISH.put("domingo", "sunday");
    }
    
    public static String translate(String spanishDay) {
        return SPANISH_TO_ENGLISH.getOrDefault(spanishDay, "");
    }
}

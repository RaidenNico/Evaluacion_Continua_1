package pe.edu.idat.dsw1soapJ19;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class MyServiceEndpoint {

    @PayloadRoot(namespace = "http://example.com/your-namespace", localPart = "YourRequestElementName")
    @ResponsePayload
    public MyResponse yourServiceOperation(MyRequest request) {
        String spanishDay = request.getDayOfWeek();
        String englishDay = DayTranslator.translate(spanishDay);
        
        MyResponse response = new MyResponse();
        response.setTranslatedDayOfWeek(englishDay);
        
        return response;
    }
}

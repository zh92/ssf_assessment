package sg.edu.nus.iss.ssf_assessment.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/shippingaddress", produces = MediaType.APPLICATION_JSON_VALUE)
public class RestOrderController {
    
    //@GetMapping(path="{orderid}")
    //public Response<Entity> getOrder(name="orderid"){}
}

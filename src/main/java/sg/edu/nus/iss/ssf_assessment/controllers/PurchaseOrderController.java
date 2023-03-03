package sg.edu.nus.iss.ssf_assessment.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sg.edu.nus.iss.ssf_assessment.models.Order;

@Controller
public class PurchaseOrderController {
    
    @GetMapping(path="/view1")
    public String getIndex() {

        //.addAttribute("cart", new Item());
        return "view1";
    }

    @GetMapping(path="/view2")
    public String getOrderDetails(Model m) {

        m.addAttribute("order", new Order());
        return "view2";
    }
}

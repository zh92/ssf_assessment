package sg.edu.nus.iss.ssf_assessment.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import sg.edu.nus.iss.ssf_assessment.models.Item;
import sg.edu.nus.iss.ssf_assessment.models.Order;
import sg.edu.nus.iss.ssf_assessment.repositories.ItemRepo;

@Controller
public class PurchaseOrderController {

    @Autowired
    ItemRepo itemRepo;
    
    // View 1 -> Landing page
    @GetMapping(path="/")
    public String getIndex(Model m) {
    
        m.addAttribute("items", new Item());
        return "view1";
    }

    @PostMapping(path={"/"}, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE, produces = "text/html")
    public String addItem(@Valid @ModelAttribute Item item, BindingResult result, Model m) {

        if (result.hasErrors()) {
            return "view1";
        }
        
        List<Item> itm = itemRepo.getItemList();
        m.addAttribute("items", itm);
        return "redirect:/";
    }
            
    // View 2 -> Shipping details page
    @GetMapping(path="/shippingaddress")
    public String getOrderDetails(Model m) {

        m.addAttribute("order", new Order());
        return "view2";
    }
}

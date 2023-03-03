package sg.edu.nus.iss.ssf_assessment.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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

        m.addAttribute("item", new Item());
        return "view1";
    }
    
    // View 1 -> Adding items to cart
    // @PostMapping(path="/")
    //     public String addItem(@RequestBody MultiValueMap <String, Object> form, Model m, BindingResult bindings) {
            
    //         if (bindings.hasErrors())
	// 		return "view1";

    //         String name = (String)form.getFirst("name");
    //         int quantity = (int)form.getFirst("quantity");
    //         List<Item> items = itemRepo.findAll();
    //         items.add
    //         m.addAttribute("items", items);
    //         return "view1";
    //     }

    @PostMapping("/")
    public String addItem(@Valid @ModelAttribute("item") Item itemForm, BindingResult result, Model m) {

        if (result.hasErrors()) {
            return "view1";
        }

        m.addAttribute("item", itemForm);
        return "/";
    }
            
    // View 2 -> Shipping details page
    @GetMapping(path="/shippingaddress")
    public String getOrderDetails(Model m) {

        m.addAttribute("order", new Order());
        return "view2";
    }
}

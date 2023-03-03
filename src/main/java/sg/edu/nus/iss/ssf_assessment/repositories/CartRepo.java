package sg.edu.nus.iss.ssf_assessment.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import sg.edu.nus.iss.ssf_assessment.models.Item;

@Repository
public class CartRepo {
    
    private List<Item> itemList;
    
    public List<Item> getCarItems() {
        
        return itemList;
    }
}

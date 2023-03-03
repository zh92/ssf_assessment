package sg.edu.nus.iss.ssf_assessment.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import sg.edu.nus.iss.ssf_assessment.models.Item;

@Repository
public class ItemRepo {
    
    private List<Item> items;
    
    public ItemRepo() {
        if (null == items) {
            items = new ArrayList<Item>();
        }
        Item item = new Item("apple", 3);
        items.add(item);

        item = new Item("bread", 5);
        items.add(item);
    }
    public List<Item> findAll() {
        return items;
    }
}

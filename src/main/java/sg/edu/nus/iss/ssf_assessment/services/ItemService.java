package sg.edu.nus.iss.ssf_assessment.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.edu.nus.iss.ssf_assessment.repositories.ItemRepo;

@Service
public class ItemService {

    @Autowired
    ItemRepo itemRepo;
    
    public static final String[] CART_ITEM_NAME = { "apple", "orange", "bread", "cheese", "chicken", "mineral_water", "instant_noodles"};

    
}

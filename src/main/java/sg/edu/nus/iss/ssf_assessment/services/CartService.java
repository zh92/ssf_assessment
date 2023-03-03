package sg.edu.nus.iss.ssf_assessment.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.edu.nus.iss.ssf_assessment.repositories.CartRepo;

@Service
public class CartService {

    @Autowired
    CartRepo cartRepo;
    
    public static final String[] CART_ITEM_NAME = { "Apple", "Orange", "Bread", "Cheese", "Chicken", "Mineral Water", "Instant Noodles"};
}

package sg.edu.nus.iss.ssf_assessment.models;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class Item {
    
    @NotNull(message="Your cart is currently empty")
    @NotEmpty(message="Your cart is currently empty")
    private String name;
    
    @Min(value=1, message="You must add at least 1 item")
    private int quantity = -1;

    public String getName() { return name; }
    public void setName(String item) { this.name = item;}
    public int getQuantity() { return quantity;}
    public void setQuantity(int quantity) { 
        if(this.quantity < 0) {
            this.quantity = quantity;
        }
        this.quantity += quantity;
    }

    public Item() {
    }

    public Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
    
    @Override 
    public String toString() {
        return "Item{itemName=%s, itemQuantity=%d}".formatted(name, quantity);
    }
}

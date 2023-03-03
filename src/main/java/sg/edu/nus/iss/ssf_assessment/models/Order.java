package sg.edu.nus.iss.ssf_assessment.models;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class Order {
    
    @NotNull(message="Name field cannot be empty")
    @Min(value=2, message="Name must have at least 2 characters")
    private String customerName;

    @NotNull(message="Address field cannot be empty")
    private String address;

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName;}
    public String getAddress() { return address;}
    public void setAddress(String address) { this.address = address;}

    public Order() {
    }

    public Order(String customerName, String address) {
        this.customerName = customerName;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Order [customerName=" + customerName + ", address=" + address + "]";
    }
}

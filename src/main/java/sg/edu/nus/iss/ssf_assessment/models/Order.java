package sg.edu.nus.iss.ssf_assessment.models;

public class Order {
    private String customerName;
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

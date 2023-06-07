package src.lesson13.coffeeOrder;

public class Order {
    private int number;
    private String customerName;

    public Order(int number, String customerName) {
        this.number = number;
        this.customerName = customerName;
    }

    public int getNumber() {
        return number;
    }

    public String getCustomerName() {
        return customerName;
    }
}

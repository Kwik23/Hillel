package src.lesson13.coffeeOrder;

import java.util.ArrayList;

import java.util.List;

public class CoffeeOrderBoard {
    private List<Order> orders;
    private int nextOrderNumber;

    public CoffeeOrderBoard() {
        orders = new ArrayList<>();
        nextOrderNumber = 1;
    }

    public void add(String customerName) {
        Order newOrder = new Order(nextOrderNumber, customerName);
        orders.add(newOrder);
        nextOrderNumber++;
    }

    public void deliver() {
        if (!orders.isEmpty()) {
            Order nextOrder = orders.get(0);
            System.out.println("Delivering order: " + nextOrder.getNumber() + " | " + nextOrder.getCustomerName());
            orders.remove(0);
        } else {
            System.out.println("No orders to deliver.");
        }
    }

    public void deliver(int orderNumber) {
        for (int i = 0; i < orders.size(); i++) {
            Order order = orders.get(i);
            if (order.getNumber() == orderNumber) {
                System.out.println("Delivering order: " + order.getNumber() + " | " + order.getCustomerName());
                orders.remove(i);
                return;
            }
        }
        System.out.println("Order " + orderNumber + " not found.");
    }

    public void draw() {
        System.out.println("Num | Name");
        for (Order order : orders) {
            System.out.println(order.getNumber() + " | " + order.getCustomerName());
        }
    }
}
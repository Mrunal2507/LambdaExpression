package com.cg.assignments;

import java.util.Arrays;
import java.util.List;

public class Order {

    private int orderId;
    private double price;
    private String status;

    public Order(int orderId, double price, String status) {
        this.orderId = orderId;
        this.price = price;
        this.status = status;
    }

    public int getOrderId() {
        return orderId;
    }

    public double getPrice() {
        return price;
    }

    public String getStatus() {
        return status;
    }

    public static void main(String[] args) {
        Order laptop = new Order(1, 15000, "ACCEPTED");
        Order mobile = new Order(2, 8000, "COMPLETED");
        Order charger = new Order(3, 12000, "PENDING");
        Order chords = new Order(4, 5000, "ACCEPTED");
        Order pen = new Order(5, 20000, "COMPLETED");

        List<Order> orders = Arrays.asList(laptop, mobile, charger, chords, pen);

        List<Order> ordersMoreThan10000Price = orders.stream()
                .filter(order -> order.getPrice() > 10000 && (order.getStatus().equals("ACCEPTED") || order.getStatus().equals("COMPLETED")))
                .toList();

        for (Order order : ordersMoreThan10000Price) {
            System.out.println("Order ID: " + order.getOrderId() + ", Price: " + order.getPrice() + ", Status: " + order.getStatus());
        }
    }
}




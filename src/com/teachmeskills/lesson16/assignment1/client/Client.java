package com.teachmeskills.lesson16.assignment1.client;

import com.teachmeskills.lesson16.assignment1.order.Order;

import java.util.HashMap;
import java.util.Map;

public class Client {

    public String name;
    public String lastName;
    public int age;
    public Map<Integer, Order> orders;

    public Client(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.orders = new HashMap<>();
    }

    public void addOrder(int orderId, Order order){
        orders.put(orderId, order);
    }

}

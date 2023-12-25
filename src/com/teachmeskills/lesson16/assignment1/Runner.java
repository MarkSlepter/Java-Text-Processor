package com.teachmeskills.lesson16.assignment1;

import com.teachmeskills.lesson16.assignment1.client.Client;
import com.teachmeskills.lesson16.assignment1.constant.IPassportNumber;
import com.teachmeskills.lesson16.assignment1.order.Order;

import java.util.*;

public class Runner {

    public static void main(String[] args) {

        Client mark = new Client("Mark", "Barduk", 21);
        Client wane = new Client("Wane", "Cherry", 53);
        Client jane = new Client("Jane", "Livskiy", 26);

        mark.addOrder(1, new Order("Kiwi", 13.4, 2.11));
        mark.addOrder(2, new Order("Bread", 0.750, 3.44));

        wane.addOrder(1, new Order("Onion", 0.22, 1.13));
        wane.addOrder(2, new Order("Chocolate", 0.15, 2.25));

        jane.addOrder(1, new Order("Milk", 0.5, 3));
        jane.addOrder(2, new Order("Fish", 1.13, 16));

        Map<String, Client> clientMap = new HashMap<>();
        clientMap.put(IPassportNumber.PASSPORT_MARK, mark);
        clientMap.put(IPassportNumber.PASSPORT_WANE, wane);
        clientMap.put(IPassportNumber.PASSPORT_JANE, jane);

        System.out.println("Information about clients and their orders: ");

        for (Map.Entry<String, Client> entry : clientMap.entrySet()) {
            System.out.println("Passport: " + entry.getKey() + ", Client: " + entry.getValue().name);
            System.out.println("Orders of client: ");

            for (Map.Entry<Integer, Order> orderEntry : entry.getValue().orders.entrySet()) {
                System.out.println("  Order #" + orderEntry.getKey() +
                        ": Price - " + orderEntry.getValue().productName +
                        ", Product weight - " + orderEntry.getValue().weight +
                        ", Product name - " + orderEntry.getValue().price);
            }

            System.out.println();

        }

        System.out.println("Printing all key-value pairs using an iterator: ");
        Iterator<Map.Entry<String, Client>> iterator = clientMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Client> entry = iterator.next();
            System.out.println("Passport: " + entry.getKey() + ", Client: " + entry.getValue().name);
        }

        System.out.println("Print all keys using map.keySet(): ");
        Set<String> keys = clientMap.keySet();
        for (String key : keys) {
            System.out.println("Passport: " + key);
        }

        System.out.println("Printing all values using map.values(): ");
        Collection<Client> values = clientMap.values();
        for (Client value : values) {
            System.out.println("Client: " + value.name);
        }

    }

}

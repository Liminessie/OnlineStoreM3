package controller;

import java.util.ArrayList;

import model.Customers;

public class CustomerController {
    
    ArrayList<Customers> customerList = new ArrayList<>();

    public void addElement(String customerName, String customerSurname, String customerEmail, String customerPhone, String customerResidence, String customerDate) {
        customerList.add(new Customers(customerName, customerSurname, customerEmail, customerPhone, customerResidence, customerDate));
    }

    public void findElement(int id) {
        customerList.get(id);
    }

    public void updateElement(String type, Customers customer) {
        customerList.set(0, customer);
    }

    public void deleteElement(int id) {
        customerList.remove(id);
    }

    public void listElement() {
        customerList.forEach((product) -> {
            System.out.println(product);
        });
    }
}

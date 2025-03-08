/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.ArrayList;
import java.util.List;
import model.Customer;

/**
 *
 * @author Johana
 */
public class Login {
    
    private List<Customer> customers;
    
    public Login() {
        this.customers = new ArrayList<>();
        customers.add(new Customer(1, "Juan", "Pérez", "juan@example.com", "123456789", "Calle 123", "2024-01-01", "CIF123", "pass123"));
        customers.add(new Customer(2, "María", "López", "maria@example.com", "987654321", "Avenida 456", "2024-02-01", "CIF456", "pass456"));
            customers.add(new Customer(2, "Testing", "Testerson", "test", "987654321", "Avenida 456", "2024-02-01", "CIF456", "pass"));

    }
    
    public Customer authenticate(String email, String password) {
        
        for (Customer customer : customers) {
            if (customer.getEmail().equals(email) && customer.getPassword().equals(password)) {
                return customer; // Retorna el cliente si las credenciales son correctas
            }
        }
        return null; // Retorna null si las credenciales no son válidas
    }
}

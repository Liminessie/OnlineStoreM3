package controller;

import java.util.ArrayList;
import model.Customer;
import model.Product;

public class Invoicing {
    public void generateInvoice(Customer customer, ArrayList<Product> cartList){
        System.out.println("Factura a nombre de: " + customer.getName() + " " + customer.getSurname());
        System.out.println("Email: " + customer.getEmail());
        System.out.println("Teléfono: " + customer.getPhone());
        System.out.println("Dirección: " + customer.getResidence());
        System.out.println("Fecha de unión: " + customer.getRegistrationDate());
        System.out.println("CIF: " + customer.getTaxID());
        System.out.println("====================================");
        
        System.out.println("Productos en el carrito:");
        float totalAmount = 0;
        
        for (Product product : cartList) {
            float productTotal = product.getSalePrice() * product.getUnit();
            totalAmount += productTotal;
            System.out.println(product.getName() + " x" + product.getUnit() + " = " + productTotal);
        }
        
        System.out.println("====================================");
        System.out.println("Total a pagar: " + totalAmount);
    }   
    
}

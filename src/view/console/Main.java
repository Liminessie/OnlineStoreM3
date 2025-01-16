/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.console;

import controller.Cart;
import java.util.ArrayList;
import model.Product;

/**
 *
 * @author Johana
 */
public class Main {
    static ArrayList<Product> productList = new ArrayList<Product>();
    
    public static void main(String[] args) {
        Product product1 = new Product(1, "Laptop", "Laptop con pantalla de 15 pulgadas", 500.00f, 750.00f, 1, "Negro", true, 10);
        Product product2 = new Product(2, "Smartphone", "Smartphone con cámara de 48 MP", 200.00f, 350.00f, 2, "Azul", true, 25);
        Product product3 = new Product(3, "Mouse", "Mouse inalámbrico ergonómico", 15.00f, 25.00f, 3, "Blanco", true, 50);
        Product product4 = new Product(4, "Teclado", "Teclado mecánico retroiluminado", 45.00f, 70.00f, 3, "Negro", true, 20);
        Product product5 = new Product(5, "Monitor", "Monitor 4K de 27 pulgadas", 250.00f, 400.00f, 4, "Gris", true, 15);
        Product product6 = new Product(6, "Impresora", "Impresora láser multifunción", 150.00f, 230.00f, 5, "Blanco", false, 5);
        Product product7 = new Product(7, "Audífonos", "Audífonos con cancelación de ruido", 80.00f, 120.00f, 6, "Negro", true, 30);
        Product product8 = new Product(8, "Silla", "Silla ergonómica para oficina", 100.00f, 180.00f, 7, "Gris", true, 12);
        Product product9 = new Product(9, "Webcam", "Webcam Full HD con micrófono", 40.00f, 60.00f, 8, "Negro", true, 22);
        Product product10 = new Product(10, "Disco Duro", "Disco duro externo de 1TB", 50.00f, 80.00f, 9, "Negro", true,24);
        
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        productList.add(product6);
        productList.add(product7);
        productList.add(product8);
        productList.add(product9);
        productList.add(product10);
        
        Cart cart = new Cart();
        
        cart.addElement(productList);
        
    }
  
}

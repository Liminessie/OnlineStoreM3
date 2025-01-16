package controller;

import java.util.ArrayList;

import model.Product;

public class ProductController {
    
    ArrayList<Product> productList = new ArrayList<>();

    public void addElement(int id, String name, String description, float supplierPrice, float salePrice, int category, String color, boolean stock, int unit) {
        productList.add(new Product(id, name, description, supplierPrice, salePrice, category, color, stock, unit));
    }

    public void findElement(int id) {
        productList.get(id);
    }

    public void updateElement(String type, Product product) {
        productList.set(0, product);
    }

    public void deleteElement(int id) {
        productList.remove(id);
    }

    public void listElement() {
        productList.forEach((product) -> {
            System.out.println(product);
        });
    }

    
}

package controller;

import java.util.ArrayList;

import model.Product;

public class ProductController {
    
    ArrayList<Product> productList = new ArrayList<>();

    public void addProduct(String name, String description, float supplierPrice, float salePrice, int category, String color) {
        productList.add(new Product(name, description, supplierPrice, salePrice, category, color));
    }

    public void findProduct() {
        productList.size();
    }

    public void updateProduct() {
        
    }

    public void deleteProduct() {

    }

    public void listProduct() {
        
    }
}

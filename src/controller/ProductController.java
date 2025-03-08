package controller;

import java.util.ArrayList;

import Interface.ControllerInterface;
import model.Product;

public class ProductController implements ControllerInterface<Product> {

    public void addElement(ArrayList<Product> productList, Product object) {
        productList.add(object);
    }

    public void findElement(ArrayList<Product> productList, int id) {
        productList.get(id);
    }

    @Override
    public void updateElement(ArrayList<Product> productList, int id, Product value) {
        productList.set(id, value);
    }

    @Override
    public void deleteElement(ArrayList<Product> productList, int id) {
        productList.remove(id);
    }

    public void listElement(ArrayList<Product> productList) {
        for (Object object : productList) {
            System.out.println((Product) object);
        }
    }
}

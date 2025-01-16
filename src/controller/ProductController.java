package controller;

import java.util.ArrayList;

import Interface.ControllerInterface;
import model.Product;

public class ProductController implements ControllerInterface {
    
    ArrayList<Product> productList = new ArrayList<>();

    public void addElement(ArrayList productList, Object object) {
        productList.add(object);
    }

    public void findElement(ArrayList productList, int id) {
        productList.get(id);
    }

    @Override
    public void updateElement(ArrayList productList, int id, String value) {
        productList.set(id, value);
    }

    @Override
    public void deleteElement(ArrayList productList, int id) {
        productList.remove(id);
    }

    public void listElement(ArrayList productList) {
        for (Object object : productList) {
            System.out.println((Product) object);
        }
    }
}

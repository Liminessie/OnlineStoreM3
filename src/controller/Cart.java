package controller;

import Interface.ControllerInterface;
import java.util.ArrayList;
import model.Product;

public class Cart extends Product implements ControllerInterface<Product> {
    
    ArrayList<Product> productList = new ArrayList<>();
    ArrayList<Product> inventory; 
    
    public Cart(){
    }
    
    public Cart(ArrayList<Product> inventory){
        this.inventory = inventory;
    }

    @Override
    public void findElement(ArrayList<Product> arrayList, int id) {
        arrayList.get(id);
    }

    @Override
    public void deleteElement(ArrayList<Product> arrayList, int id) {
        arrayList.remove(id);
    }

    @Override
    public void listElement(ArrayList<Product> arraylist) {
        for (Object object : arraylist) {
            System.out.println((Product) object);
        }
    }

    @Override
    public void addElement(ArrayList<Product> arraylist, Product object) {
        
    }

    public void updateElement(ArrayList<Product> arraylist, int id, Product value) {
        arraylist.set(id, value);
    }
    
}

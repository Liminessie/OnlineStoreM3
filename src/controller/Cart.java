package controller;

import Interface.ControllerInterface;
import java.util.ArrayList;
import model.Product;

public class Cart extends Product implements ControllerInterface{
    
    ArrayList<Product> productList = new ArrayList<>();
    ArrayList<Product> inventory; 
    
    public Cart(){
    }
    
    public Cart(ArrayList<Product> inventory){
        this.inventory = inventory;
    }

    @Override
    public void findElement(ArrayList arrayList, int id) {
        arrayList.get(id);
    }

    @Override
    public void deleteElement(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void listElement(@SuppressWarnings("rawtypes") ArrayList arraylist) {
        for (Object object : arraylist) {
            System.out.println((Product) object);
        }
    }

    @Override
    public void addElement(@SuppressWarnings("rawtypes") ArrayList arraylist, Object object) {
        
    }

    @SuppressWarnings("unchecked")
    @Override
    public void updateElement(ArrayList arraylist, Object object, int id, String value) {
        arraylist.set(id, value);
    }

    
    
}

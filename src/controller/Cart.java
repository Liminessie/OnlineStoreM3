/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Interface.ControllerInterface;
import java.util.ArrayList;
import model.Product;

/**
 *
 * @author Johana
 */
public class Cart implements ControllerInterface{
    
    ArrayList<Product> productList = new ArrayList<>();
    ArrayList<Product> inventory; 
    
    public Cart(){
    }
    
    public Cart(ArrayList<Product> inventory){
        this.inventory = inventory;
    }
    
//    public void addElement(Product product) {
//        if(inventory.contains(product)){
//            productList.add(product);
//        } else{
//            System.out.println("Error: El producto no existe en el inventario");
//        }
//    }

    @Override
    public void findElement(int id) {
        
    }

    @Override
    public void deleteElement(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void listElement() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void addElement(ArrayList arraylist) {
        for (Object object : arraylist) {
            System.out.println((Product) object);
        }
    }

    
    
}

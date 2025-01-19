package controller;

import Interface.ControllerInterface;
import java.util.ArrayList;
import model.Product;

public class Cart extends Product implements ControllerInterface<Product> {
    
    // Hey Pol!! Esta será una lista privada para cada uno de los clientes
    // tomará los productos de la ArrayList de Products que hará de catálogo.
    ArrayList<Product> cartList = new ArrayList<>();
    
    
    public Cart(){
    }
    
    public Cart(ArrayList<Product> cartList){
        this.cartList = new ArrayList<>();
    }
    
    @Override
    public void addElement(ArrayList<Product> arrayList, Product product) {
        arrayList.add(product);
        System.out.println("Se ha añadido al carrito: " + product.getName());
    }

    @Override
    public void findElement(ArrayList<Product> arrayList, int id) {
        // Esto se hace peusto que el ID que guardaremos será el ID De la lista externa
        // Cuyo id no coincide con el index por el cual se guia el método arrayList.get()
        Product product = null;
        for (Product p : arrayList) { 
            if(p.getID() == id)
                product = p;
                break;
        }
        if (product != null) System.out.println("Producto encontrado: " + product);
        else System.out.println("Producto no encontrado");
    }

    @Override
    public void deleteElement(ArrayList<Product> arrayList, int id) {
        Product product = findProductByID(arrayList, id);
        if (product != null) {
            arrayList.remove(product);
            System.out.println("Producto eliminado del carrito " + product.getName());
        } else  System.out.println("Producto ID " + id + " no encontrado en el carrito" );
    }

    @Override
    public void listElement(ArrayList<Product> arrayList) {
        if (arrayList.isEmpty()) System.out.println("Aún no has añadido productos al carrito.");
        else{
            System.out.println("Carrito: ");
            for (Product product : arrayList) {
                System.out.println(product);
            }
        }
    }

    @Override
    public void updateElement(ArrayList<Product> arrayList, int id, Product updatedProduct) {
            Product product = findProductByID(arrayList, id);
        if (product != null) {
            int index = arrayList.indexOf(product);
            arrayList.set(index, updatedProduct);
            System.out.println("Producto actualizado");
        } else {
            System.out.println("Producto con ID " + id + " no encontrado");
        }
    }
    
    // Método para buscar productos por .getID no index!! 
    private Product findProductByID(ArrayList<Product> arrayList, int id) {
        for (Product product : arrayList) {
            if (product.getID() == id) {
                return product;
            }
        }
        return null;
    }
    
    
    // Getters!! 
    public ArrayList<Product> getProductList() {
        return cartList;
    }
}

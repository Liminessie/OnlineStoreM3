package Interface;

import java.util.ArrayList;
import model.Product;

public interface ControllerInterface {
    
    public void addElement(ArrayList<Object> arraylist);
     // Se implementa en Cart
    
    public void findElement(int id);
    
    
    //public void updateElement(String type, Object object);
    
    public void deleteElement(int id);
    
    public void listElement();    
}
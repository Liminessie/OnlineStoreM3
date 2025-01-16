package Interface;

import java.util.ArrayList;

public interface ControllerInterface {
    
    public void addElement(ArrayList arraylist, Object object);
     // Se implementa en Cart
    
    public void findElement(ArrayList arrayList, int id);
    
    
    public void updateElement(ArrayList arraylist, Object object, int id, String value);
    
    public void deleteElement(int id);
    
    public void listElement(@SuppressWarnings("rawtypes") ArrayList arraylist);    
}
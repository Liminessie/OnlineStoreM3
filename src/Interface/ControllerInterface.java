package Interface;

import java.util.ArrayList;

public interface ControllerInterface {
    
    public void addElement(ArrayList arraylist, Object object);
    
    public void findElement(ArrayList arrayList, int id);
    
    public void updateElement(ArrayList arraylist, int id, String value);
    
    public void deleteElement(ArrayList arraylist, int id);
    
    public void listElement(@SuppressWarnings("rawtypes") ArrayList arraylist);    
}
package Interface;

import java.util.ArrayList;

public interface ControllerInterface<T> {
    
    public void addElement(ArrayList<T> arraylist, T object);
    
    public void findElement(ArrayList<T> arrayList, int id);
    
    public void updateElement(ArrayList<T> arraylist, int id, T object);
    
    public void deleteElement(ArrayList<T> arraylist, int id);
    
    public void listElement(ArrayList<T> arraylist);
}
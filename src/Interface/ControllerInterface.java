package Interface;

import java.util.ArrayList;

public interface ControllerInterface<t> {
    
    public void addElement(ArrayList<t> arraylist, t object);
    
    public void findElement(ArrayList<t> arrayList, int id);
    
    public void updateElement(ArrayList<t> arraylist, int id, t object);
    
    public void deleteElement(ArrayList<t> arraylist, int id);
    
    public void listElement(ArrayList<t> arraylist);
}
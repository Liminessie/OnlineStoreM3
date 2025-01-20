package controller;

import java.util.ArrayList;

import Interface.ControllerInterface;
import model.Customer;

public class CustomerController implements ControllerInterface<Customer> {

    @Override
    public void addElement(ArrayList<Customer> arraylist, Customer object) {
        arraylist.add(object);
    }

    @Override
    public void findElement(ArrayList<Customer> arrayList, int id) {
        arrayList.get(id);
    }

    @Override
    public void updateElement(ArrayList<Customer> arraylist, int id, Customer object) {
        arraylist.set(id, object);
    }

    @Override
    public void deleteElement(ArrayList<Customer> arraylist, int id) {
        arraylist.remove(id);
    }

    @Override
    public void listElement(ArrayList<Customer> arraylist) {
        arraylist.forEach((customer) -> {
            System.out.println("ID: " + customer.getId());
            System.out.println("Nombre: " + customer.getName());
            System.out.println("Apellido: " + customer.getSurname());
            System.out.println("Email: " + customer.getEmail());
            System.out.println("Teléfono: " + customer.getPhone());
            System.out.println("Dirección: " + customer.getResidence());
            System.out.println("Fecha de unión: " + customer.getRegistrationDate());
            System.out.println("CIF: " + customer.getTaxID());
            System.out.println("====================================");
        });
    }


}

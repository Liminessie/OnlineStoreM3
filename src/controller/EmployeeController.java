package controller;

import java.util.ArrayList;

import Interface.ControllerInterface;
import model.Employee;

public class EmployeeController implements ControllerInterface<Employee> {

    @Override
    public void addElement(ArrayList<Employee> arraylist, Employee object) {
        arraylist.add(object);
    }

    @Override
    public void findElement(ArrayList<Employee> arraylist, int id) {
        arraylist.get(id);
    }

    @Override
    public void updateElement(ArrayList<Employee> arraylist, int id, Employee value) {
        arraylist.set(id, value);
    }

    @Override
    public void deleteElement(ArrayList<Employee> arraylist, int id) {
        arraylist.remove(id);
    }

    @Override
    public void listElement(ArrayList<Employee> arraylist) {
        arraylist.forEach((employee) -> {
                System.out.println("ID: " + employee.getId());
                System.out.println("Nombre: " + employee.getName());
                System.out.println("Apellido: " + employee.getSurname());
                System.out.println("Email: " + employee.getEmail());
                System.out.println("Teléfono: " + employee.getPhone());
                System.out.println("Salary: " + employee.getSalary());
                System.out.println("Fecha de unión: " + employee.getHireDate());
                System.out.println("====================================");
        });
    }

    
}

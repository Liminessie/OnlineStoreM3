package controller;

import java.util.ArrayList;

import model.Employees;

public class EmployeeController {

    ArrayList<Employees> employeeList = new ArrayList<>();

    public void addElement(String name, String lastName, String email, String phone, float salary, String hireDate) {
        employeeList.add(new Employees(name, lastName, email, phone, salary, hireDate));
    }


    public void findElement(int id) {
        employeeList.get(id);
    }

    public void updateElement(String type, Employees employee) {
        employeeList.set(0, employee);
    }

    public void deleteElement(int id) {
        employeeList.remove(id);
    }

    public void listElement() {
        employeeList.forEach((employee) -> {
            System.out.println(employee);
        });
    }
}

package model;

import validation.Validator;

public class Employee {
    private int id;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private float salary;
    private String hireDate;

    public Employee() {

    }
 
    public Employee(int employeeId, String employeeName, String employeeSurname, String employeeEmail, String employeePhone, float employeeSalary, String employeeHireDate) {
        this.id = employeeId;
        this.name = employeeName;
        this.surname = employeeSurname;
        this.email = employeeEmail;
        this.phone = employeePhone;
        this.salary = employeeSalary;
        this.hireDate = employeeHireDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int employeeId) {
        this.id = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        if (Validator.validateDate(hireDate)) {
            this.hireDate = hireDate;
        } else {
            System.out.println("Incorrect format or date");
        }
        
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Product{");
        sb.append("name= ").append(name);
        sb.append("surname= ").append(surname);
        sb.append(", email= ").append(email);
        sb.append(", phone= ").append(phone);
        sb.append(", salary= ").append(salary);
        sb.append(", hire date= ").append(hireDate);
        sb.append('}');
        return sb.toString();
    }
}

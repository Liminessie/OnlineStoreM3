package model;

import java.time.LocalDate;
import validation.Validator;

public class Employees {
    private String name;
    private String surname;
    private String email;
    private String phone;
    private float salary;
    private LocalDate hireDate;

    public Employees(String employeeName, String employeeSurname, String employeeEmail, String employeePhone, float employeeSalary, LocalDate employeeHireDate) {
        this.name = employeeName;
        this.surname = employeeSurname;
        this.email = employeeEmail;
        this.phone = employeePhone;
        this.salary = employeeSalary;
        this.hireDate = employeeHireDate;
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
        if (Validator.validateEmail(email)) {
            this.email = email;
        } else {
            System.out.println("Invalid email");
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (Validator.validatePhone(phone)) {
            this.phone = phone;
        } else {
            System.out.println("Invalid phone");
        }
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        if (Validator.validateDate(hireDate)) {
            this.hireDate = hireDate;
        } else {
            System.out.println("Invalid date");
        }
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee{");
        sb.append(" name= ").append(name).append(" ");
        sb.append("surname= ").append(surname).append(" ");
        sb.append("email= ").append(email).append(" ");
        sb.append("phone= ").append(phone).append(" ");
        sb.append("salary= ").append(salary).append(" ");
        sb.append("hire date= ").append(hireDate).append(" ");
        sb.append('}');
        return sb.toString();
    }
}

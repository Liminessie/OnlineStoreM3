package model;

import java.time.LocalDate;
import validation.Validator;

public class Supplier {
    private String name;
    private String email;
    private String phone;
    private int supplierType;
    private LocalDate lastShipment;

    public Supplier(String supplierName, String supplierEmail, String supplierPhone, int supplierType, LocalDate supplierLastShipment) {
        this.name = supplierName;
        this.email = supplierEmail;
        this.phone = supplierPhone;
        this.supplierType = supplierType;
        this.lastShipment = supplierLastShipment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getSupplierType() {
        return supplierType;
    }

    public void setSupplierType(int supplierType) {
        this.supplierType = supplierType;
    }

    public LocalDate getlastShipment() {
        return lastShipment;
    }

    public void setCategory(LocalDate lastShipment) {
        this.lastShipment = lastShipment;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Supplier{");
        sb.append("name= ").append(name);
        sb.append(", email= ").append(email);
        sb.append(", phone= ").append(phone);
        sb.append(", supplier type= ").append(supplierType);
        sb.append(", last shipment= ").append(lastShipment);
        sb.append('}');
        return sb.toString();
    }
}

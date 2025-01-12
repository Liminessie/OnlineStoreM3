package model;

public class Customers {
    
    private String name;
    private String surname;
    private String email;
    private String phone;
    private String residence;
    private String dateOfUnion;

    public Customers(String customerName, String customerSurname, String customerEmail, String customerPhone, String customerResidence, String customerDate) {
        this.name = customerName;
        this.surname = customerSurname;
        this.email = customerEmail;
        this.phone = customerPhone;
        this.residence = customerResidence;
        this.dateOfUnion = customerDate;
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

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public String getDateUnion() {
        return dateOfUnion;
    }

    public void setDateUnion(String dateUnion) {
        this.dateOfUnion = dateUnion;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Product{");
        sb.append("name= ").append(name);
        sb.append("surname= ").append(surname);
        sb.append(", email= ").append(email);
        sb.append(", phone= ").append(phone);
        sb.append(", residence= ").append(residence);
        sb.append(", date of union= ").append(dateOfUnion);
        sb.append('}');
        return sb.toString();
    }

}

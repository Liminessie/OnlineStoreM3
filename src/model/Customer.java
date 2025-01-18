package model;

public class Customer {

    private String name;
    private String surname;
    private String email;
    private String phone;
    private String residence;
    private String registrationDate;  // Cambié de dateOfUnion a registrationDate

    public Customer(String customerName, String customerSurname, String customerEmail, String customerPhone, String customerResidence, String customerRegistrationDate) {
        this.name = customerName;
        this.surname = customerSurname;
        this.email = customerEmail;
        this.phone = customerPhone;
        this.residence = customerResidence;
        this.registrationDate = customerRegistrationDate;  // Asignación del nuevo atributo
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

    public String getRegistrationDate() {  // Método getter actualizado
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {  // Método setter actualizado
        this.registrationDate = registrationDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Customer{");
        sb.append("name= ").append(name);
        sb.append(", surname= ").append(surname);
        sb.append(", email= ").append(email);
        sb.append(", phone= ").append(phone);
        sb.append(", residence= ").append(residence);
        sb.append(", registrationDate= ").append(registrationDate);  // Actualización en el toString
        sb.append('}');
        return sb.toString();
    }

}

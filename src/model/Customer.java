package model;

public class Customer {
    private int id;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private String residence;
    private String registrationDate;
    private String taxID; 

<<<<<<< Updated upstream
    // Constructor
    public Customer(int customerId, String name, String surname, String email, String phone, String residence, String registrationDate, String taxID) {
        this.id = customerId;
=======
    
    public Customer(String name, String surname, String email, String phone, String residence, String registrationDate, String taxID) {
>>>>>>> Stashed changes
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.residence = residence;
        this.registrationDate = registrationDate;
        this.taxID = taxID;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int customerId) {
        this.id = customerId;
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

    public String getRegistrationDate() {  
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {  
        this.registrationDate = registrationDate;
    }

    public String getTaxID() {
        return taxID;
    }

    public void setTaxID(String taxID) { 
        this.taxID = taxID;
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
        sb.append(", registrationDate= ").append(registrationDate);
        sb.append(", taxID= ").append(taxID); 
        return sb.toString();
    }

}

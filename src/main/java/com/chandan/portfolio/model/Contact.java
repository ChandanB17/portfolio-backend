package com.chandan.portfolio.model;
import java.util.UUID;
import jakarta.persistence.*;

@Entity
public class Contact {

    @Id
    @GeneratedValue
    @Column(columnDefinition = "UUID")
    private UUID id;
    
    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private String message;

    // getters & setters

    public String getFirstname() { return firstname; }
    public void setFirstname(String firstname) { this.firstname = firstname; }

    public String getLastname() { return lastname; }
    public void setLastname(String lastname) { this.lastname = lastname; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
}
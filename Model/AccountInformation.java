package Model;

import java.util.Date;

public class AccountInformation {
    private String username;
    private String email;
    private double phoneNumber;
    private String firstName;
    private String lastName;
    private String address;
    private double cardNumber;
    private int zipCode;
    private Date cardExpiration;
    private String state;
    private int pin;
    public String getUsername() {
        return this.username;
    }
    public String getEmail() {
        return this.email;
    }
    public double getPhoneNumber() {
        return this.phoneNumber;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public String getAddress() {
        return this.address;
    }
    public double getCardNumber() {
        return this.cardNumber;
    }
    public int getZipCode() {
        return this.zipCode;
    }
    public Date getCardExpiration() {
        return this.cardExpiration;
    }
    public String getState() {
        return this.state;
    }
    public int getPin() {
        return this.pin;
    }
}

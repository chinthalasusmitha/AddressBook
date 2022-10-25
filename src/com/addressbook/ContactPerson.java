package com.addressbook;

public class ContactPerson {
    //Declaring variables for Address Book
    private String firstname;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String email;

    public ContactPerson(String firstname, String lastName, String address, String city, String state,
                         String zip, String phoneNumber, String email) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;

    }

    public ContactPerson() {

    }


    @Override
    public String toString() {
        return "ContactPerson{" +
                "firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }

    public void printContact() {
    }

    public boolean checkList() {
        return false;
    }

    public void addContact() {
    }

    public boolean editContact(String person_name) {
        return false;
    }

    public boolean deleteContact(String firstName) {
        return false;
    }
}

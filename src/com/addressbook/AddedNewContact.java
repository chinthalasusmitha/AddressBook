package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddedNewContact {
    //Creating an arraylist.
    private static ArrayList<String> contactDetails = new ArrayList<>();

    //Default Constructor
    public void AddressBookMain()
    {
        System.out.println("Welcome to Address Book Program !!!");
    }

    public static void main(String[] args) {

        AddressBookMain obj = new AddressBookMain();        //Initialize Object

        ContactPerson addressBook = new ContactPerson("Susmitha","Reddy","Bachupally","Hyderabad",
                "Telangana","500090","9177376524","susmithareddy083@gmail.com");

        //Adding another contact
        System.out.println();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the contact details.............");
        System.out.println("Enter the first name:");
        String firstName = scan.nextLine();
        System.out.println("Enter the last name:");
        String lastName = scan.nextLine();
        System.out.println("Enter the address:");
        String address = scan.nextLine();
        System.out.println("Enter the city:");
        String city = scan.nextLine();
        System.out.println("Enter the state:");
        String state = scan.nextLine();
        System.out.println("Enter the zip code:");
        String zip = scan.nextLine();
        System.out.println("Enter the phone no:");
        String phoneNumber = scan.nextLine();
        System.out.println("Enter the email:");
        String email = scan.nextLine();
        scan.close();
        ContactPerson b = new ContactPerson(firstName, lastName, address, city, state,zip,phoneNumber,email);

        //Parsing the object to create a list
        contactDetails.add(addressBook.toString());
        contactDetails.add(b.toString());

        //Printing contact details
        addressBook.printContact();
    }
}


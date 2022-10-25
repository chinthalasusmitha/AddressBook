package com.addressbook;

public class AddressBookMain {

    //Default Constructor

    public AddressBookMain() {

        System.out.println("Welcome to Address Book Program !!!");
    }
    public static void main(String[] args) {

        //Initialize Object
        AddressBookMain book = new AddressBookMain();

        //Calling Encapsulated Class object
        ContactPerson addressBook = new ContactPerson("Sumitha","Reddy","Bachupally","Hyderabad",
                "Telangana","500090","9177376524","susmithareddy083@gmail.com");
//        System.out.println("Welcome to Address Book Program !!!");
        System.out.print("\n"+addressBook.toString());
    }

}
package com.addressbook;

import java.util.Scanner;

public class EditAnExistingContact {
    public static void main(String[] args) {

        AddressBookMain obj = new AddressBookMain();

        //Operations in address book.
        Scanner scan = new Scanner(System.in);
        ContactPerson addressBook = new ContactPerson();

        boolean flag = true;

        while(flag) {

            System.out.println("1.Add Contact");
            System.out.println("2.Edit Contact");
            System.out.println("3.Exit");
            System.out.println("Enter Choice: ");

            int option = scan.nextInt();

            switch (option) {
                case 1:
                    addressBook.addContact();
                    addressBook.printContact();
                    break;

                case 2:
                    if (addressBook.checkList() == true) {
                        System.out.println("Enter the Person First name to edit details: ");
                        String person_name = scan.next();
                        boolean b = addressBook.editContact();
                        if (b == true)
                        {
                            System.out.println("Details Updated");
                        }
                        else
                        {
                            System.out.println("Contact Not Found");
                        }
                    }
                    else
                        System.out.println("Nothing in the contact list.\nPlease create one");
                    break;

                case 3:
                    addressBook.printContact();
                    flag = false;
                    break;
            }
        }
        scan.close();
    }
}

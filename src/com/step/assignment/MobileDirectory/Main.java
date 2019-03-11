package com.step.assignment.MobileDirectory;

import java.util.Scanner;

public class Main {


    public static MobilePhone mobilePhone = new MobilePhone("123456789");
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean finish = false;
        while(!finish){

            System.out.println("Choose your choice");
            printOptions();
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    finish = true;
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    deleteContact();
                    break;
                case 4:
                    updateContact();
                    break;
                case 5:
                    queryContact();
                    break;

            }
        }

    }

    public static void addContact() {
        String name = getName();
        String number = getNumber();
        Contact contact = Contact.createContact(name, number);
        mobilePhone.addContact(contact);

    }

    public static void queryContact() {
        String name = getName();
        Contact existingContact = mobilePhone.queryContact(name);
        System.out.println(existingContact.getName() + " " + existingContact.getNumber());

    }

    public static void deleteContact() {
        String name = getName();
        Contact existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found.");
            return;
        }
        mobilePhone.removeContact(existingContact);

    }

    public static void updateContact() {
        System.out.println("enter the old name");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.print("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter new contact phone number: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        mobilePhone.updateContact(existingContact,newContact);

    }


    public static String getName() {
        System.out.println("enter the name");
        return scanner.nextLine();
    }

    public static String getNumber() {
        System.out.println("enter the number");
        return scanner.nextLine();
    }

    public static void printOptions() {
        System.out.println("0: Quit\n" +
                "1: Display\n" +
                "2: Add \n" +
                "3: delete\n" +
                "4: update\n" +
                "5: Query\n");
    }

    public static void printContacts() {
        mobilePhone.printContacts();
    }
}

package com.step.assignment.MobileDirectory;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContact;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContact = new ArrayList<Contact>();
    }

    public boolean addContact(Contact contact) {
       if(findContact(contact.getName()) >=0) {
            System.out.println("Contact is already exist");
            return false;
        }
        myContact.add(contact);
        return true;
    }

    private int findContact(Contact contact) {
        System.out.println(contact);
        return this.myContact.indexOf(contact);
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int contactPosition = findContact(oldContact);
        System.out.println(contactPosition);
        if (contactPosition < 0) {
            System.out.println("Updation failed");
            return false;
        }
        this.myContact.set(contactPosition, newContact);
        System.out.println("Updated sucessfully");
        return true;

    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if(position >=0) {
            return this.myContact.get(position);
        }

        return null;
    }

    public boolean removeContact(Contact contact){
        int contactPosition = findContact(contact);
        if (contactPosition >= 0) {
            this.myContact.remove(contactPosition);
            System.out.println("removed sucessfully");
            return true;
        }
        System.out.println("Remove failed");
        return false;
    }

    public void printContacts(){
        for(int i = 0; i< this.myContact.size(); i++){
            System.out.println(this.myContact.get(i).getName());
            System.out.println(this.myContact.get(i).getNumber());

        }
    }


    private int findContact(String contactName) {
        for(int i=0; i<this.myContact.size(); i++) {
            Contact contact = this.myContact.get(i);
            if(contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }
}

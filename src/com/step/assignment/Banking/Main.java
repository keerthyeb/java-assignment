package com.step.assignment.Banking;

import java.util.Scanner;

public class Main {

    public static Bank bank = new Bank("Keerthy Bank");
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean finish = false;
        while (!finish) {

            System.out.println("Choose your choice");
            printOptions();
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    finish = true;
                    break;
                case 1:
                    addBranch();
                    break;
                case 2:
                    addCustomer();
                    break;
                case 3:
                    addTranctions();
                    break;
                case 4:
                    displayCustomers();
                    break;
                case 5 :
                    displayBranches();
                    break;

            }
        }


    }

    public static void printOptions(){
        System.out.println("0: Quit\n" +
                "1: AddBranch\n" +
                "2: AddCustomer \n" +
                "3: AddTranctions\n" +
                "4: displayCustomers\n" +
                "5: displayBranches\n");
    }

    public static void addBranch(){
        System.out.println("Enter the bank name");
        String bankName = scanner.nextLine();
        Branch branch = Branch.createBranch(bankName);
        bank.addBranch(branch);

    }

    public static void addCustomer(){
        System.out.println("enter bank name");
        String branch = scanner.nextLine();
        System.out.println("enter customer name");
        String customerName = scanner.nextLine();
        Customer customer = Customer.createCustomer(customerName);
        bank.addCustomer(branch, customer);

    }

    public static void addTranctions(){
        System.out.println("enter bank name");
        String branch = scanner.nextLine();
        System.out.println("enter customer name");
        String customerName = scanner.nextLine();
        System.out.println("enter transaction");
        Double transaction = scanner.nextDouble();
        Customer customer = Customer.createCustomer(customerName);
        bank.addTranction(branch,customerName,transaction);
    }

    public static void displayCustomers(){
        System.out.println("enter bank name");
        String branch = scanner.nextLine();
        bank.displayCustomers(branch);
    }

    public static void displayBranches(){
        bank.displayBranches();
    }
}

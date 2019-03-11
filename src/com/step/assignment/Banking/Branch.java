package com.step.assignment.Banking;

import java.util.ArrayList;
import java.util.List;

public class Branch {
    private String name;
    private List<Customer> customers;

    public Branch(String name, ArrayList<Customer> customers) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public void addCustomer(Customer customer) {
        if (findCustomer(customer.getName()) > 0) {
            System.out.println("Can not add customer");
            return;
        }
        customers.add(customer);
    }

    public int findCustomer(String name) {
        for (int i = 0; i < this.customers.size(); i++) {
            Customer customer = customers.get(i);
            String customerName = customer.getName();
            if (customerName.equals(name)) return i;
        }
        return -1;

    }

    public void displayCustomers(){
        for(int i= 0; i< customers.size(); i++){
            System.out.println(customers.get(i).getName());
            System.out.println(customers.get(i).getTransactions());
        }
    }

    public void addAmount(String name, double transaction){
        int customerIndex = findCustomer(name);
        if ( customerIndex < 0) {
            System.out.println("Customer not found");
            return ;
        }
        customers.get(customerIndex).addTransaction(transaction);

    }

    public static Branch createBranch(String bankName){
        return new Branch(bankName, new ArrayList<Customer>());
    }

}

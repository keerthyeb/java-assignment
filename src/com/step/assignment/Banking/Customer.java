package com.step.assignment.Banking;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private List<Double> transactions;

    public Customer(String name, ArrayList<Double> doubles) {
        this.name = name;
        this.transactions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(Double tranction){
        transactions.add(tranction);
    }

    public static Customer createCustomer(String customerName){
        return new Customer(customerName, new ArrayList<Double>());
    }
}

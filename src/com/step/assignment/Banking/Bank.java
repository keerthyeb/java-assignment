package com.step.assignment.Banking;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String name;
    private List<Branch> branches;

    public Bank(String name) {
        this.name = name;
         branches = new ArrayList<Branch>();
    }

    public String getName() {
        return name;
    }

    public void addBranch(Branch branch) {
        if (findBranch(branch.getName()) >= 0) {
            System.out.println("Can not add branch");
            return;
        }
        branches.add(branch);
    }

    public void addCustomer(String bankName, Customer customer){
        int branchIndex = findBranch(bankName);
        if ( branchIndex < 0) {
            System.out.println("No bank found");
            return;
        }

        branches.get(branchIndex).addCustomer(customer);

    }

    public void addTranction(String bankName, String customerName, double tranctions){
        int branchIndex = findBranch(bankName);
        if ( branchIndex < 0) {
            System.out.println("No bank found");
            return;
        }
        branches.get(branchIndex).addAmount(customerName,tranctions);

    }

    public void displayCustomers(String bankName){
        int branchIndex = findBranch(bankName);
        if ( branchIndex < 0) {
            System.out.println("No bank found");
            return;
        }
        branches.get(branchIndex).displayCustomers();

    }


    public int findBranch(String name) {
        for (int i = 0 ; i < this.branches.size(); i++) {
            Branch branch = branches.get(i);
            String branchName = branch.getName();
            if (branchName.equals(name))return i;
        }
        return -1;

    }

    public void displayBranches(){
        for(int i= 0; i< branches.size(); i++){
            System.out.println(branches.get(i).getName());
        }
    }

}

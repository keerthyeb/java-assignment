package com.step.assignment.Duplicate;

public class Main {
    public static void main(String[] args) {
        DuplicateUnoCard duplicate = new UnoCard("wildCard").duplicate();
        System.out.println(duplicate.getContent());
        DuplicateIdentityCard duplicateIdentityCard = new IdentityCard("Keerthy").duplicate();
        System.out.println(duplicateIdentityCard.getName());

    }
}

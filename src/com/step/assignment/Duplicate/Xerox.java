package com.step.assignment.Duplicate;

public class Xerox {

    public <O extends Duplicable<D>,D> D duplicate(O original){
        return (D) original.duplicate();
    }

    public static void main(String[] args) {
        Xerox xerox = new Xerox();
        DuplicateUnoCard duplicateUnoCard = xerox.duplicate(new UnoCard("spl card"));
        System.out.println(duplicateUnoCard.getContent());
        DuplicateIdentityCard duplicateIdentityCard = xerox.duplicate(new IdentityCard("mahesh"));
        System.out.println(duplicateIdentityCard.getName());
    }



}

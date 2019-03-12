package com.step.assignment.Duplicate;

public class IdentityCard implements Duplicable<DuplicateIdentityCard>{
    private String name;

    public IdentityCard(String name) {
        this.name = name;
    }


    @Override
    public DuplicateIdentityCard duplicate() {
        return new DuplicateIdentityCard(this.name);
    }
}

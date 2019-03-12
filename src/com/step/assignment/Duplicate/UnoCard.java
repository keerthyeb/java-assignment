package com.step.assignment.Duplicate;

public class UnoCard implements Duplicable<DuplicateUnoCard> {
    private String content ;

    public UnoCard(String content) {
        this.content = content;
    }

    @Override
    public DuplicateUnoCard duplicate() {
     return new DuplicateUnoCard(this.content);
    }
}

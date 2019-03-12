package com.step.assignment.polymorphism;

public class Console implements Display{

    @Override
    public void displayContent(String content) {
        System.out.println(content);
    }
}

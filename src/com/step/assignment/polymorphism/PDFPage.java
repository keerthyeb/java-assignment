package com.step.assignment.polymorphism;

public class PDFPage implements Display {
    public String returnContent(){
        return "This is the content of PDF page";
    }

    @Override
    public void displayContent(String content) {
        System.out.println(content);
    }
}

package com.step.assignment.polymorphism;

public class WebPage implements Display {
    private String content = "This is the content of WEB page";
    public String returnContent(){
        return this.content;
    }

    public void click(){
        this.displayContent("user has clicked on the web page");
    }

    public void printContent(){
        this.displayContent("This is the content of WEB page");
    }

    @Override
    public void displayContent(String content) {
        System.out.println(content);
    }
}

package com.step.assignment.polymorphism;

public class NonInteractiveWebPage implements Display {

    public String returnContent(){
        return "This is the content of Non interative web page";
    }

    public void click(){
        this.displayContent("user can not on the web page");
    }

    public void printContent(){
        this.displayContent("This is the content of non intreative page");
    }

    @Override
    public void displayContent(String content) {
        System.out.println(content);
    }
}

package com.step.assignment.polymorphism;

public class Main {
    public static void main(String[] args) {
    PDFPage pdfPage = new PDFPage();
    WebPage webPage = new WebPage();
    NonInteractiveWebPage nonInteractiveWebPage = new NonInteractiveWebPage();
    Console console = new Console();
    console.displayContent("this is anything class");
    }
}

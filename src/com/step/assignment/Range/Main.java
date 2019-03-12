package com.step.assignment.Range;

public class Main {
    public static void main(String[] args) {
        IntegerRange numbers = new IntegerRange(1, 10);
        CharacterRange characters = new CharacterRange('a', 'm');
        System.out.println(numbers.getAll());
        System.out.println(numbers.contains(2));
        System.out.println(numbers.contains(11));
        System.out.println(characters.getAll());
        System.out.println(characters.contains('b'));
        System.out.println(characters.contains('p'));
    }
}

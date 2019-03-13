package com.step.assignment.ComoarableVSComparator;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private  String name;
    private Integer accBalance;

    public Person(String name, Integer accBalance) {
        this.name = name;
        this.accBalance = accBalance;
    }

    public String getName() {
        return name;
    }

    public Integer getAccBalance() {
        return accBalance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(getName(), person.getName()) &&
                Objects.equals(getAccBalance(), person.getAccBalance());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAccBalance());
    }

    @Override
    public String toString() {
        return this.getName() + "Balance" + this.getAccBalance();
    }

    @Override
    public int compareTo(Person o) {
        return this.getAccBalance()-o.getAccBalance();
    }
}

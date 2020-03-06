package com.company.lab2.prob3;

public class Prob3 {
    public static void main(String[] args) {
        Person person = new Person("soltan", "gheorhge", 20);

        person.increase_age();

        System.out.println(person.getFirst_name() + person.getLast_name() + person.getAge());
    }
}

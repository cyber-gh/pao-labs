package com.company.lab5.prob1;

public class CounterOutTask implements Task {
    private static Integer counter = 0;

    @Override
    public void execute() {
        System.out.println(counter++);
    }
}

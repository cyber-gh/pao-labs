package com.company.lab5.prob1;

public class RandomTask implements Task{
    private final String msg;

    public RandomTask(String msg) {
        this.msg = msg;
    }

    @Override
    public void execute() {
        System.out.println(msg);
    }
}

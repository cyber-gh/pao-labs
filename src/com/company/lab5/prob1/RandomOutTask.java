package com.company.lab5.prob1;

public class RandomOutTask implements Task{
    private final double nr = Math.random();

    @Override
    public void execute() {
        System.out.println(nr);
    }
}

package com.company.lab2.prob4;

import java.util.Scanner;

public class Prob4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Student[] arr = new Student[100];
        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split(" ");
            String nume = line[0];
            float nota = Float.parseFloat(line[1]);

            arr[i] = new Student(nume, nota);


        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i].getNume() + " " + arr[i].getNota());
        }


    }
}

package com.company.lab6;

import java.io.*;
import java.util.Scanner;

public class prob1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        Integer n = scanner.nextInt();

        BufferedWriter writer = new BufferedWriter(new FileWriter("test.out"));
        for (int i = 0; i < n; i++) {
            try {
                Integer p1 = scanner.nextInt();
                Integer p2 = scanner.nextInt();
                if (p1 > p2) throw new Exception();
                writer.write(p1.toString() + " " + p2.toString());

            } catch (Exception e) {
                i--;
            }
        }
        writer.close();
    }
}

package com.company.lab6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Scanner;

public class prob2 {
    public static void main(String[] args) {

        HashMap<String, String> database = new HashMap();
        try {
            FileInputStream inputStream = new FileInputStream(new File("parole.txt"));
            String content = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
            System.out.println(content);

            for (String s : content.split("\n")) {
                String []line = s.split(":");
                database.put(line[0], line[1]);
            }

            Scanner scanner = new Scanner(System.in);
            Integer nrTriesTotal = 0;
            while (nrTriesTotal <= 5) {
                System.out.println("Your username");
                String username = scanner.nextLine();
                System.out.println("Your password");
                String password = scanner.nextLine();


                if (database.containsKey(username)) {
                    if (database.get(username).equals(password)) {
                        System.out.println("Log in successfully");
                        return;
                    } else {
                        System.out.println("Wrong password");
                    }
                } else {
                    System.out.println("No such username");
                }
                nrTriesTotal++;
            }
            System.out.println("No account");


        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Cant read from file");
        }

    }
}

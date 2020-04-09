package com.company.lab6;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class prob3 {
    public static void main(String[] args) {
        try {
            File file;
            BufferedReader reader = new BufferedReader(new FileReader("clients.txt"));
            String line = reader.readLine();
            Integer major = 0;
            Integer minor = 0;
            List<Client> majors = new LinkedList<>();
            while (line != null) {
                String []components = line.split(":");
                Client client = new Client(components[0], components[1], Integer.parseInt( components[2]));
                if (client.getAge() >= 18)  {
                    major++;
                    majors.add(client);
                } else {
                    minor++;
                }
                line = reader.readLine();
            }

            System.out.println("Majori = " + major);
            System.out.println("Minori = " + minor);
            System.out.println("List major:");
            for (Client client : majors) {
                System.out.println(client);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Can't read fro mfile");
        }
    }
}


class Client {
    final String firstName;
    final String lastName;
    final Integer age;

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Client{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public Client(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}

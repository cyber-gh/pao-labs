package com.company.lab4;

import java.util.Scanner;


public class prob2 {
    public static void main(String[] args) {
        String[] strings = new String[100];
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int k = 0;
        int mx = -1;
        String longest = "";
        for (int i = 0; i < n; i++) {
            String temp = scanner.nextLine();
            if (isPalindrome(temp)) {
                strings[++k] = temp;
                if (temp.length() > mx) {
                    mx = temp.length();
                    longest = temp;
                }
            }
        }
        System.out.println(longest);


    }

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int j = str.length() - i - 1;
            if (str.charAt(i) != str.charAt(j)) return false;
        }
        return true;
    }

    public static void useless(String str) {
        StringBuilder builder = new StringBuilder(str);
        builder.append("useless");
        builder.deleteCharAt(2);
        String ans = builder.toString();
    }
}

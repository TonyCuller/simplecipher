package com.company;


import java.util.Scanner;

public class Main {
    final static char[] plain = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    final static char[] cipher = "zywvutsrqponmlkjihgfedcba".toCharArray();

    public static void main(String[] args) {

        System.out.print("Enter a word: ");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        char[] charText = text.toCharArray();
        System.out.print("Encode or decode " + text + ": ");

        String choice = input.nextLine();

        if (choice.equalsIgnoreCase("Encode")) {
            System.out.println(text + " encoded is " + encode(charText));
        } else if (choice.equalsIgnoreCase("decode")) {
            System.out.println(text + " decoded is " + decode(charText));
        }

    }

    public static String encode(char[] a) {
        System.out.println("Main.encode");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < plain.length; j++) {
                if (a[i] == plain[j]) {
                    a[i] = cipher[j];
                    break;
                }

            }
        }
        return String.valueOf(a);

    }

    public static String decode(char[] a) {
        System.out.println("Main.decode");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < cipher.length; j++) {
                if (a[i] == cipher[j]) {
                    a[i] = plain[j];
                    break;
                }
            }
        }
        return String.valueOf(a);
    }
}




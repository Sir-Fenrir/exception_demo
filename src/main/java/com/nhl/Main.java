package com.nhl;

import java.util.Scanner;

public class Main {

    private static final String prompt = "Please enter two integers seperated by a space, the first will be divided by the second.";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        String input = scanner.nextLine();

        while(!"exit".equalsIgnoreCase(input)) {
            String[] split = input.split(" ");
            int result = Integer.parseInt(split[0]) / Integer.parseInt(split[1]);
            System.out.println("The result is: " + result);
            System.out.println(prompt);
            input = scanner.nextLine();
        }

    }
}

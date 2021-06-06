/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Alexander De Corte
 */

import java.util.Scanner; //Import Scanner class

public class solution01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = in.nextLine();
        System.out.printf("Hello, %s, nice to meet you!\n", name);
    }
}

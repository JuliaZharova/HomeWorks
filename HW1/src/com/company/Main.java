package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    String name;
	    String address;
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        name = scanner.nextLine();

        System.out.println("Where are you live, " + name + "?");
        address = scanner.nextLine();

        System.out.println("Name: " + name + "\nAddress: " + address);
    }
}

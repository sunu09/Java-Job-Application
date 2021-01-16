package com.tts;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {

        Scanner printer = new Scanner(System.in);

        int ageLimit = 18;
        int choose;
        int zip;

        System.out.println("Welcome to job apply site!");

        System.out.println("Would you like to apply for this job?");
        System.out.print(" (Y/N): ");
        String gameResponse = printer.next();
        boolean approved = gameResponse.equals("Y") || gameResponse.equals("y");
        if (approved) {
            System.out.println("What is your age?");
            int age = printer.nextInt();

            if (age < ageLimit) {
                System.out.println("Sorry you are not qualified to apply for this job.");
                System.exit(0);

            } else if (age >= ageLimit) {
                System.out.println("What is your name?");
                System.out.print("First Name: ");
                String fName = printer.next();
                System.out.print("Last Name: ");
                String lName = printer.next();
            } else {
                System.out.println("Thank you.");
                System.exit(0);
            }
        }

            System.out.println("Enter your full address");
            System.out.print("Street: ");
            String line1 = printer.next();
            System.out.print("City: ");
            String line2 = printer.next();
            System.out.print("State: ");
            String line13 = printer.next();
            System.out.print("5 digit Zip Code: ");
            zip = printer.nextInt();
            while ((zip < 10000) || (zip > 99999)) {
                System.out.println("Invalid Zip Code.");
                System.out.println("");
                System.out.print("5 digit Zip Code: ");
                zip = printer.nextInt();
            }

            System.out.println("Choose the area of interest");
            System.out.println("1- Front End Developer");
            System.out.println("2- Back End Developer");
            System.out.println("3- Full Stack Developer");
            System.out.println("4 - Data Science");
            System.out.println("5 - Quality Assurance");
            choose = printer.nextInt();
            System.out.println("Your area of interest is: " + choose);

//        switch (choose) {
//            case 1:
//                System.out.println("");
//        }


            }
        }






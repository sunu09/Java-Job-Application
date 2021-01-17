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

        if (!approved) {
            System.exit(0);
        }
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

            switch (choose) {
            case 1:
                System.out.println("List 3 skill/knowledge related to this field");
                    System.out.println("1: ");
                    String skill1 = printer.next();
                    System.out.println("2: ");
                    String skill2 = printer.next();
                    System.out.println("3: ");
                    String skill3 = printer.next();
                    break;

              case 2:
               System.out.println("List best 3 skill/knowledge related to this field");
                    System.out.println("i: ");
                    String skill4 = printer.next();
                    System.out.println("ii: ");
                    String skill5 = printer.next();
                    System.out.println("iii: ");
                    String skill6 = printer.next();
                    break;

                case 3:
                    System.out.println("Rate your knowledge");
                    System.out.println("Front End Developer (in the range of 1-10): ");
                    int range1 = printer.nextInt();
                    System.out.println("Back End Developer (in the range of 1-10): ");
                    int range2 = printer.nextInt();
                    System.out.println("Full Stack Developer (in the range of 1-10): ");
                    int range3 = printer.nextInt();
                    break;

                case 4:
                    System.out.println("Name 2 programs you can perform well");
                    System.out.print("a): ");
                    String name1 = printer.next();
                    System.out.print("b): ");
                    break;

                case 5:
                    System.out.println("How many years of experience do you have in QA");
                    System.out.print("Manual Testing (0-5 years): ");
                    String manual = printer.next();
                    System.out.print("Automation Testing (0-5 years): ");
                    String automation = printer.next();

                default:
                    System.out.println("Open to any field at entry level");



            }


            }
        }






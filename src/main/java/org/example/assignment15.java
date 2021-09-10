/*
 *  UCF COP3330 Fall 2021 Assignment 15 Solution
 *  Copyright 2021 Nicholas Smarsh
 */

package org.example;
import java.util.Scanner;

public class assignment15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //vars for program
        String StoredUser = "nickstar";
        String StoredPassword = "nickiscool";

        String InputUser;
        String InputPassword;

        //ask for user, (Example output does not show user, but the assignment ask for it)
        System.out.println("Please enter your Username.");
        InputUser = scan.nextLine();

        //ask for password
        System.out.println("What is the password?");
        InputPassword = scan.nextLine();

        if(StoredUser.equals(InputUser)) {
            if(StoredPassword.equals(InputPassword)) {
                System.out.println("Welcome " + StoredUser + "!");
            }
            else {
                System.out.println("Sorry incorrect user/password!");
            }
        }
        else {
            System.out.println("Sorry incorrect user/password!");
        }
    }
}

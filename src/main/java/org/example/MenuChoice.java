package org.example;

import java.util.Scanner;

public class MenuChoice {
    static Scanner scanner = new Scanner(System.in);

    public static void mainMenu() {

        System.out.println("Welcome!  \n Do you want to handle information about: \n " +
                "1. All staff | " +

                "2. Employees | " +
                "3. Interns " );
        int choice = scanner.nextInt();
        MenuOption.menuOption(choice);

    }







}

package org.example;

public class MenuOption {

    public static void menuOption(int choice) {

        if( choice == 1 ) {
            System.out.println("Here's the information about all staff");
        }
        else if ( choice == 2 ) {
            System.out.println("Here's info about all employees");
        }
        else if (choice == 3) {
            System.out.println("Here's info about all the interns");
        }
        else System.out.println("Choose a valid option");
    }
}

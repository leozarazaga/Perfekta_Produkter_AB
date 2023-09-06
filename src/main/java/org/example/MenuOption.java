package org.example;

public class MenuOption {

    public static void menuOption(int choice) {


        switch (choice) {
            case 1:
                System.out.println("List of all staffmembers: ");

                //call a method that lists all the staff


                break;
            case 2:
                System.out.println();

                // call a method that shows employee menu options
                EmployeeMenu.employeeMenu();

                break;

            case 3:
                // call a method that shows intern menu options

                break;
            case 4:
                // method that exits the program
                break;
        }


    }


/*
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

 */



}

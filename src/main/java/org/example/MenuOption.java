package org.example;

import static org.example.Employee.employeeList;
import static org.example.Intern.internList;

public class MenuOption {

    public static void menuOption(int choice) {

        switch (choice) {
            case 1:
                System.out.println("List of all staffmembers: ");
                System.out.println(employeeList);
                System.out.println(internList);
                // printa ut antal staff

                break;
            case 2:
                EmployeeMenu.employeeMenu();
                break;
            case 3:
                InternMenu.InternMenu();
                break;
            case 4:
                System.exit(0);
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

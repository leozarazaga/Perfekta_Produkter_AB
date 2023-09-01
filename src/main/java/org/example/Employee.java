package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Employee extends Staff implements WorkerList {

    private LocalDate startDate;
    private int paycheck;

    static List<Employee> employeeList = new ArrayList<>();
    public Employee(int id, String gender, String name, LocalDate startDate, int paycheck) {
        super(id, gender, name);
        this.startDate = startDate;
        this.paycheck = paycheck;
    }

    public static String getStaffList() {
        StringBuilder sb = new StringBuilder();
        employeeList.forEach(person -> {
            sb.append(person.toString()); // Assuming each person has a meaningful toString() method
            sb.append("\n");
        });

        return sb.toString();
    }



    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public int getPaycheck() {
        return paycheck;
    }

    public void setPaycheck(int paycheck) {
        this.paycheck = paycheck;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public String staffList() {
        return null;
    }


   /* @Override
    public String staffList() {
        StringBuilder sb = new StringBuilder();
        employeeList.forEach(person -> {
            sb.append(person.toString()); // Assuming each person has a meaningful toString() method
            sb.append("\n");
        });

        return sb.toString();
    }*/

}

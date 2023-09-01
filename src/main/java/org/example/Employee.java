package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Employee extends Staff implements StaffDetailsProvider {

    private LocalDate startDate;
    private int paycheck;

    static List<Employee> employeeList = new ArrayList<>();
    public Employee(int id, String gender, String name, LocalDate startDate, int paycheck) {
        super(id, gender, name);
        this.startDate = startDate;
        this.paycheck = paycheck;
    }

    @Override
    public String toString() {
        return "id: " + getId() +
                ", gender: '" + getGender() + '\'' +
                ", name: '" + getName() + '\'' +
                ", startDate: " + startDate +
                ", paycheck: " + paycheck;
    }
    /*
    public static String getStaffList() {
        StringBuilder sb = new StringBuilder();
        for (Employee employee : employeeList) {
            sb.append(employee.toString()).append("\n");
        }
        return sb.toString();
    }

*/
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
    public String retrieveStaffDetails() {
        StringBuilder sb = new StringBuilder();
        for (Employee employee : employeeList) {
            sb.append(employee.toString()).append("\n");
        }
        return sb.toString();
    }

    /*
    @Override
    public String staffList() {
        return null;
    }



     */
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

package org.example.Employee;

import org.example.Staff;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Employee extends Staff {

    private LocalDate startDate;
    private int paycheck;
    public static List<Employee> employeeList = new ArrayList<>();
    public Employee(String id, String gender, String name, LocalDate startDate, int paycheck) {
        super(id, gender, name);
        this.startDate = startDate;
        this.paycheck = paycheck;
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

    @Override
    public String toString() {
        return "id: " + getId() +
                ", gender: '" + getGender() + '\'' +
                ", name: '" + getName() + '\'' +
                ", startDate: " + startDate +
                ", paycheck: $" + paycheck + "\n";
    }



}

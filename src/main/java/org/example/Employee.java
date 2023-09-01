package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Employee extends Staff implements WorkerList {

    private Date startDate;
    private int paycheck;

    static List<String> employeeList = new ArrayList<>();
    public Employee(int id, String gender, String name, Date startDate, int paycheck) {
        super(id, gender, name);
        this.startDate = startDate;
        this.paycheck = paycheck;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public int getPaycheck() {
        return paycheck;
    }

    public void setPaycheck(int paycheck) {
        this.paycheck = paycheck;
    }

    public List<String> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<String> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public String staffList() {
        return employeeList.get();
    }
}

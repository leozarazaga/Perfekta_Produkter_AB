package org.example;

import java.util.Date;

public class Employee extends Staff implements StaffList{

    private Date startDate;
    private int paycheck;

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

}

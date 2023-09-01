package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Intern extends Staff implements WorkerList {
    private Date endDate;
    private String quitMessage;

    List<String> internList = new ArrayList<>();

    public Intern(int id, String gender, String name, Date endDate, String quitMessage) {
        super(id, gender, name);

        this.endDate = endDate;
        this.quitMessage = quitMessage;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getQuitMessage() {
        return quitMessage;
    }

    public void setQuitMessage(String quitMessage) {
        this.quitMessage = quitMessage;
    }

    public List<String> getInternList() {
        return internList;
    }

    public void setInternList(List<String> internList) {
        this.internList = internList;
    }

    @Override
    public String staffList() {
        return null;
    }
}

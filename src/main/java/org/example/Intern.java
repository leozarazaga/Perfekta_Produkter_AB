package org.example;

import java.util.Date;

public class Intern extends Staff {
    private Date endDate;
    private String quitMessage;


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
}

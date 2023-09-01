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
}

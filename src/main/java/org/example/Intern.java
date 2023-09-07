package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Intern extends Staff {
    private LocalDate endDate;
    private String quitMessage;

    public static List<Intern> internList = new ArrayList<>();

    public Intern(int id, String gender, String name, LocalDate endDate, String quitMessage) {
        super(id, gender, name);

        this.endDate = endDate;
        this.quitMessage = quitMessage;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getQuitMessage() {
        return quitMessage;
    }

    public void setQuitMessage(String quitMessage) {
        this.quitMessage = quitMessage;
    }

    public List<Intern> getInternList() {
        return internList;
    }

    public void setInternList(List<Intern> internList) {
        this.internList = internList;
    }


    @Override
    public String toString() {
        return "id: " + getId() +
                ", gender: '" + getGender() + '\'' +
                ", name: '" + getName() + '\'' +
                ", endDate: " + endDate +
                ", quitMessage: " + quitMessage + "\n";
    }

}

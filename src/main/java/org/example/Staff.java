package org.example;

public class Staff {
    private int id;
    private String gender;
    private String name;

    public Staff(int id, String gender, String name) {
        this.id = id;
        this.gender = gender;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

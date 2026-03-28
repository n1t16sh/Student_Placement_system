package models;

import java.util.ArrayList;

public class Company {

    private int id;
    private String name;
    private double minCgpa;
    private ArrayList<String> requiredSkills;
    private int internshipSlots;

    public Company(int id, String name, double minCgpa,
                   ArrayList<String> requiredSkills, int internshipSlots) {

        this.id = id;
        this.name = name;
        this.minCgpa = minCgpa;
        this.requiredSkills = requiredSkills;
        this.internshipSlots = internshipSlots;
    }

    // Getting function
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMinCgpa() {
        return minCgpa;
    }

    public ArrayList<String> getRequiredSkills() {
        return requiredSkills;
    }

    public int getInternshipSlots() {
        return internshipSlots;
    }


    public void reduceSlot() {
        if (internshipSlots > 0) {
            internshipSlots--;
        }
    }
}
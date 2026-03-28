package models;

import java.util.ArrayList;

public class Student {

    private int id;
    private String name;
    private double cgpa;
    private ArrayList<String> skills;
    private boolean placed;

    // Constructor
    public Student(int id, String name, double cgpa, ArrayList<String> skills) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
        this.skills = skills;
        this.placed = false; 
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public ArrayList<String> getSkills() {
        return skills;
    }

    public boolean isPlaced() {
        return placed;
    }

    
    public void setPlaced(boolean placed) {
        this.placed = placed;
    }
}
package models;
import java.util.ArrayList;

class Student {
    private String name;
    private double cgpa;
    private ArrayList<String> skills;
    private boolean placed;

    public Student(String name, double cgpa, ArrayList<String> skills) {
        this.name = name;
        this.cgpa = cgpa;
        this.skills = skills;
        this.placed = false;
    }

    public String getName() { return name; }
    public double getCgpa() { return cgpa; }
    public ArrayList<String> getSkills() { return skills; }
    public boolean isPlaced() { return placed; }

    public void setPlaced(boolean placed) {
        this.placed = placed;
    }
}
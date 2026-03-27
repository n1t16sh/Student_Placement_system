package models;
import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    private double cgpa;
    private ArrayList<String> skills;
    private ArrayList<Integer> preferedCompanies;
    
    public Student(int id,String name,double cgpa,ArrayList<String> skills,ArrayList<Integer> prefComp){
        this.id=id;
        this.name=name;
        this.cgpa=cgpa;
        this.skills=skills;
        this.preferedCompanies=prefComp;
    }

    public int getID(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getCGPA(){
        return cgpa;
    }

    public ArrayList<String> getSkills(){
        return skills;
    }

    public ArrayList<Integer> getPrefComp(){
        return preferedCompanies;
    }

}
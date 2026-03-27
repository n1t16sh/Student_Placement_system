package models;
import java.util.ArrayList;

public class Company {
    private int id;
    private String name;
    private double cgpaReq;
    private ArrayList<String> reqSkill;
    private int slots;

    public Company(int id, String name, double cgpaReq, ArrayList<String> skillReq, int slots){
        this.id=id;
        this.name=name;
        this.cgpaReq=cgpaReq;
        this.reqSkill=skillReq;
        this.slots=slots;
    }

    public int getID(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getCGPAreq(){
        return cgpaReq;
    }

    public ArrayList<String> getSkillsReq(){
        return reqSkill;
    }

    public int getSlots(){
        return slots;
    }

}

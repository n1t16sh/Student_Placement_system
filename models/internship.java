package models;
import java.util.ArrayList;

public class internship {
    private int id;
    private String name;
    private ArrayList<String> reqSkills;

    internship(int id, String name, ArrayList<String> skillReq){
        this.id=id;
        this.name=name;
        this.reqSkills=skillReq;
    }

    public int getID(){
        return id;
    }

    public String getName(){
        return name;
    }

    public ArrayList<String> getReqSkill(){
        return reqSkills;
    }
}

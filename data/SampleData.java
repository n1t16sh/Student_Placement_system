package data;
import java.util.ArrayList;

import models.Student;
import models.Company;
import models.internship;

public class SampleData {
    public static ArrayList<Student> registerStudent(){
        ArrayList<Student> students=new ArrayList<>();
        
        ArrayList<String> skills1=new ArrayList<>();
        skills1.add("java");
        skills1.add("python");
        ArrayList<Integer> prefs1=new ArrayList<>();
        prefs1.add(1);
        prefs1.add(2);
        students.add(new Student(1, "chutiya", 8.5, skills1, prefs1));

        ArrayList<String> skills2 =new ArrayList<>();
        skills2.add("python");
        skills2.add("c++");
        ArrayList(Integer) prefs2=new ArrayList<>();
        prefs2.add(2);
        students.add(new Student(2, "madarchod", 7.8, skills2, prefs2));

        ArrayList<String> skills3 =new ArrayList<>();
        skills2.add("javaScript");
        skills2.add("c++");
        ArrayList(Integer) prefs3=new ArrayList<>();
        prefs2.add(2);
        prefs2.add(3);
        students.add(new Student(3, "lodu", 7.8, skills2, prefs2));

        return students;
    }

    public static ArrayList<Company> registerCompanies(){
        ArrayList<Company> companies=new ArrayList<>();

        ArrayList<String> skills1=new ArrayList<>();
        skills1.add("java");
        companies.add(new Company(1,"xyz",7.0,skills1,1));

        

    }
}

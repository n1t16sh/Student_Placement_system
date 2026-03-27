package data;

import java.util.ArrayList;

import models.Student;
import models.Company;

public class SampleData {

    public static ArrayList<Student> registerStudent() {

        ArrayList<Student> students = new ArrayList<>();

        // Student 1
        ArrayList<String> skills1 = new ArrayList<>();
        skills1.add("java");
        skills1.add("python");

        ArrayList<Integer> prefs1 = new ArrayList<>();
        prefs1.add(1);
        prefs1.add(2);

        students.add(new Student(1, "Rahul", 8.5, skills1, prefs1));


        // Student 2
        ArrayList<String> skills2 = new ArrayList<>();
        skills2.add("python");
        skills2.add("c++");

        ArrayList<Integer> prefs2 = new ArrayList<>();
        prefs2.add(2);

        students.add(new Student(2, "Aman", 7.8, skills2, prefs2));


        // Student 3
        ArrayList<String> skills3 = new ArrayList<>();
        skills3.add("javascript");
        skills3.add("c++");

        ArrayList<Integer> prefs3 = new ArrayList<>();
        prefs3.add(2);
        prefs3.add(3);

        students.add(new Student(3, "Neha", 8.0, skills3, prefs3));

        return students;
    }


    public static ArrayList<Company> registerCompanies() {

        ArrayList<Company> companies = new ArrayList<>();

        // Company 1
        ArrayList<String> skills1 = new ArrayList<>();
        skills1.add("java");

        companies.add(new Company(1, "XYZ", 7.0, skills1, 1));


        // Company 2
        ArrayList<String> skills2 = new ArrayList<>();
        skills2.add("python");

        companies.add(new Company(2, "ABC", 6.5, skills2, 2));


        // Company 3
        ArrayList<String> skills3 = new ArrayList<>();
        skills3.add("c++");

        companies.add(new Company(3, "PQR", 7.5, skills3, 1));

        return companies;
    }
}
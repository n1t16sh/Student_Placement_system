package data;

import java.util.ArrayList;

import models.Student;
import models.Company;

public class SampleData {

    public static ArrayList<Student> getStudents() {

        ArrayList<Student> students = new ArrayList<>();

        // Student 1
        ArrayList<String> skills1 = new ArrayList<>();
        skills1.add("java");
        skills1.add("python");

        students.add(new Student(1, "Rahul", 8.5, skills1));


        // Student 2
        ArrayList<String> skills2 = new ArrayList<>();
        skills2.add("python");
        skills2.add("c++");

        students.add(new Student(2, "Aman", 7.8, skills2));


        // Student 3
        ArrayList<String> skills3 = new ArrayList<>();
        skills3.add("c++");

        students.add(new Student(3, "Neha", 6.5, skills3));


        // Student 4
        ArrayList<String> skills4 = new ArrayList<>();
        skills4.add("java");

        students.add(new Student(4, "Priya", 9.0, skills4));


        // Student 5
        ArrayList<String> skills5 = new ArrayList<>();
        skills5.add("javascript");

        students.add(new Student(5, "Karan", 7.2, skills5));

        return students;
    }


    public static ArrayList<Company> getCompanies() {

        ArrayList<Company> companies = new ArrayList<>();

        // Company 1
        ArrayList<String> cskills1 = new ArrayList<>();
        cskills1.add("java");

        companies.add(new Company(1, "Google", 7.5, cskills1, 2));


        // Company 2
        ArrayList<String> cskills2 = new ArrayList<>();
        cskills2.add("python");

        companies.add(new Company(2, "Amazon", 7.0, cskills2, 1));


        // Company 3
        ArrayList<String> cskills3 = new ArrayList<>();
        cskills3.add("c++");

        companies.add(new Company(3, "Microsoft", 6.5, cskills3, 2));


        // Company 4
        ArrayList<String> cskills4 = new ArrayList<>();
        cskills4.add("javascript");

        companies.add(new Company(4, "Flipkart", 7.0, cskills4, 1));

        return companies;
    }
}
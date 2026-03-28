package main;

import java.util.ArrayList;
import data.SampleData;
import models.Student;
import models.Company;
import service.MatchingService;
public class Main {

    public static void main(String[] args) {

        ArrayList<Student> students = SampleData.registerStudent();
        ArrayList<Company> companies = SampleData.registerCompanies();

        MatchingService.matchStudents(students, companies);
    }
}
package runner;
import java.util.ArrayList;

import data.SampleData;
import models.Student;
import models.Company;
import service.MatchingService;

public class Main {

    public static void main(String[] args) {


        ArrayList<Student> students = SampleData.getStudents();
        ArrayList<Company> companies = SampleData.getCompanies();


        MatchingService.matchInternships(students, companies);

        System.out.println("\n--- Final Placement Report ---");

        for (Student s : students) {

            if (s.isPlaced()) {
                System.out.println(s.getName() + " is placed");
            } else {
                System.out.println(s.getName() + " is not placed");
            }
        }
    }
}
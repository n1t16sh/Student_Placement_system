package service;
import java.util.ArrayList;
import models.Student;
import models.Company;

public class MatchingService {

    public static void matchStudents(ArrayList<Student> students, ArrayList<Company> companies) {

        for (Student s : students) {

            System.out.println("\nTrying to place: " + s.getName());

            boolean placed = false;

            for (int pref : s.getPreferences()) {

                Company c = findCompanyById(companies, pref);

                if (c == null) continue;

                if (s.getCgpa() < c.getMinCgpa()) {
                    continue;
                }

                
                if (!hasMatchingSkill(s.getSkills(), c.getRequiredSkills())) {
                    continue;
                }

                if (c.getCapacity() <= 0) {
                    continue;
                }

                
                System.out.println(s.getName() + " placed in " + c.getName());

                c.setCapacity(c.getCapacity() - 1);
                placed = true;

                break;
            }

            if (!placed) {
                System.out.println(s.getName() + " not placed");
            }
        }
    }

    private static Company findCompanyById(ArrayList<Company> companies, int id) {
        for (Company c : companies) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    private static boolean hasMatchingSkill(ArrayList<String> studentSkills, ArrayList<String> companySkills) {

        for (String skill : studentSkills) {
            if (companySkills.contains(skill)) {
                return true;
            }
        }
        return false;
    }
}
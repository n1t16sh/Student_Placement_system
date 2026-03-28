package service;

import java.util.ArrayList;
import models.Student;
import models.Company;

public class MatchingService {

    // Skill match function
    public static boolean skillMatch(ArrayList<String> studentSkills,
                                     ArrayList<String> companySkills) {

        for (String skill : studentSkills) {
            if (companySkills.contains(skill)) {
                return true;
            }
        }
        return false;
    }

    // Main matching function
    public static void matchInternships(ArrayList<Student> students,
                                        ArrayList<Company> companies) {

        System.out.println("\n--- Internship Matching ---");

        for (Student s : students) {

            // Skip already placed students
            if (s.isPlaced()) {
                continue;
            }

            boolean placed = false;

            for (Company c : companies) {

                // CGPA check
                if (s.getCgpa() < c.getMinCgpa()) {
                    continue;
                }

                // Skill check
                if (!skillMatch(s.getSkills(), c.getRequiredSkills())) {
                    continue;
                }

                // Slot check
                if (c.getInternshipSlots() <= 0) {
                    continue;
                }

                // MATCH FOUND
                System.out.println(s.getName() +
                        " placed in " + c.getName());

                c.reduceSlot();
                s.setPlaced(true);
                placed = true;
                break;
            }

            if (!placed) {
                System.out.println(s.getName() + " not selected");
            }
        }
    }

	public static void matchStudents(ArrayList<Student> students, ArrayList<Company> companies) {
		
		throw new UnsupportedOperationException("Unimplemented method 'matchStudents'");
	}
}
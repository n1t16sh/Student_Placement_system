package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {

    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public double getCgpa() {
        return cgpa;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("ID: " + id + " Name: " + name + " CGPA: " + cgpa);
    }
}

public class SortStudents {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(1, "Rahul", 8.5));
        students.add(new Student(2, "Aman", 7.2));
        students.add(new Student(3, "Neha", 9.1));
        students.add(new Student(4, "Priya", 6.8));
        students.add(new Student(5, "Karan", 8.9));


        System.out.println("Before Sorting:");
        for (Student s : students) {
            s.display();
        }

        Collections.sort(students, new Comparator<Student>() {

            @Override
            public int compare(Student s1, Student s2) {

                if (s1.getCgpa() < s2.getCgpa()) {
                    return 1; 
                } else if (s1.getCgpa() > s2.getCgpa()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        System.out.println("\nAfter Sorting (High CGPA First):");
        for (Student s : students) {
            s.display();
        }
    }
}

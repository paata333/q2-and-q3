package oop.q3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a university that manages students.
 */
public class University {
    // Thread-safe list to manage students
    private List<Student> students;

    /**
     * Constructor to initialize the university with an empty list of students.
     */
    public University() {
        this.students = Collections.synchronizedList(new ArrayList<>());
    }

    /**
     * Adds a student to the university if not already present.
     *
     * @param s the student to add; must not be null
     * @throws IllegalArgumentException if the student is null
     */
    public void addStudent(Student s) {
        if (s == null) {
            throw new IllegalArgumentException("Student cannot be null");
        }
        if (!students.contains(s)) {
            students.add(s);
        }
    }

    /**
     * Removes a student from the university.
     *
     * @param s the student to remove
     * @return true if the student was removed, false otherwise
     */
    public boolean removeStudent(Student s) {
        return students.remove(s);
    }

    /**
     * Prints all students in the university.
     */
    public void printStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in the university.");
            return;
        }

        System.out.println("University students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    /**
     * Gets information about a student based on specific conditions.
     *
     * @param s the student to get information about
     * @return information based on the following rules:
     *         1. If the student is "yourself" and exists in the university, returns your current semester courses.
     *         2. If the student is "yourself" and doesn't exist in the university, returns your personal number.
     *         3. If the student is not "yourself" and exists in the university, returns their info field.
     *         4. If the student is not "yourself" and doesn't exist in the university, returns null.
     */
    public String getStudentInfoStrange(Student s) {
        if (s == null) {
            return null;
        }

        boolean isMyself = isMyself(s);
        boolean containsStudent = students.contains(s);

        if (isMyself) {
            if (containsStudent) {
                // Replace the hardcoded string below with dynamic semester courses if required
                return "Object Oriented Programming, english Language course c1-2, computer organisation, mathematical foundation of computing , Calculus II";
            } else {
                // Replace the hardcoded string below with your actual personal number if required
                return "185010761**";
            }
        } else {
            if (containsStudent) {
                return s.getInfo();
            } else {
                return null;
            }
        }
    }

    /**
     * Helper method to determine if a student is "yourself".
     * Update ME constants as per your personal details.
     *
     * @param s the student to check
     * @return true if the student corresponds to "yourself", false otherwise
     */
    private boolean isMyself(Student s) {
        return s != null &&
                "paata".equals(s.getName()) &&
                "shvelidze".equals(s.getSurname()) &&
                "georgia".equals(s.getCountry());
    }
}
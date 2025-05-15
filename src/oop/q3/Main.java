package oop.q3;

public class Main {
    public static void main(String[] args) {
        University university = new University();

        Student student1 = new Student("paata", "shvelidze", "georgia", "Computer Science major");
        Student student2 = new Student("Alice", "Smith", "USA", "Physics major");
        Student student3 = new Student("Bob", "Johnson", "Canada", "Mathematics major");

        // Adding students
        university.addStudent(student1);
        university.addStudent(student2);
        university.addStudent(student3);


        university.printStudents();

        // Testing getStudentInfoStrange
        System.out.println("Student Info: " + university.getStudentInfoStrange(student1)); // Should return courses or personal number.
        System.out.println("Student Info: " + university.getStudentInfoStrange(new Student("Mark", "Brown", "Germany", "Tools major"))); // Should return null.
    }
}
package classroom;

import student.Student;
import assignment.Assignment;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private String name;
    private List<Student> students;
    private List<Assignment> assignments;

    public Classroom(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.assignments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addAssignment(Assignment assignment) {
        assignments.add(assignment);
    }

    public void submitAssignment(String studentId, Assignment assignment) {
        // In a real-world scenario, you could add logic to check whether the student exists
        // and store the submission in a database or a file
        System.out.println("Assignment submitted by Student " + studentId + " in " + name + ".");
    }
}

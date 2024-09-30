package manager;

import classroom.Classroom;
import student.Student;
import assignment.Assignment;

import java.util.HashMap;
// import java.util.ArrayList;
import java.util.List;

public class VirtualClassroomManager {
    private HashMap<String, Classroom> classrooms;

    public VirtualClassroomManager() {
        classrooms = new HashMap<>();
    }

    // 1. Classroom Management
    public void addClassroom(String className) {
        if (!classrooms.containsKey(className)) {
            classrooms.put(className, new Classroom(className));
            System.out.println("Classroom " + className + " has been created.");
        } else {
            System.out.println("Classroom " + className + " already exists.");
        }
        System.out.println();
    }

    public void listClassrooms() {
        if (classrooms.isEmpty()) {
            System.out.println("No classrooms available.");
        } else {
            System.out.println("Available Classrooms:");
            for (String className : classrooms.keySet()) {
                System.out.println("- " + className);
            }
        }
        System.out.println();
    }

    public void removeClassroom(String className) {
        if (classrooms.containsKey(className)) {
            classrooms.remove(className);
            System.out.println("Classroom " + className + " has been removed.");
        } else {
            System.out.println("Classroom " + className + " does not exist.");
        }
        System.out.println();
    }

    // 2. Student Management
    public void addStudent(String studentId, String className) {
        if (classrooms.containsKey(className)) {
            Classroom classroom = classrooms.get(className);
            classroom.addStudent(new Student(studentId));
            System.out.println("Student " + studentId + " has been enrolled in " + className + ".");
        } else {
            System.out.println("Classroom " + className + " does not exist.");
        }
        System.out.println();
    }

    public void listStudents(String className) {
        if (classrooms.containsKey(className)) {
            Classroom classroom = classrooms.get(className);
            List<Student> students = classroom.getStudents();
            if (students.isEmpty()) {
                System.out.println("No students enrolled in " + className + ".");
            } else {
                System.out.println("Students enrolled in " + className + ":");
                for (Student student : students) {
                    System.out.println("- " + student.getId());
                }
            }
        } else {
            System.out.println("Classroom " + className + " does not exist.");
        }
        System.out.println();
    }

    // 3. Assignment Management
    public void scheduleAssignment(String className, String assignmentDetails) {
        if (classrooms.containsKey(className)) {
            Classroom classroom = classrooms.get(className);
            classroom.addAssignment(new Assignment(assignmentDetails));
            System.out.println("Assignment for " + className + " has been scheduled.");
        } else {
            System.out.println("Classroom " + className + " does not exist.");
        }
        System.out.println();
    }

    public void submitAssignment(String studentId, String className, String assignmentDetails) {
        if (classrooms.containsKey(className)) {
            Classroom classroom = classrooms.get(className);
            boolean studentExists = classroom.getStudents().stream()
                .anyMatch(student -> student.getId().equals(studentId));
            if (studentExists) {
                classroom.submitAssignment(studentId, new Assignment(assignmentDetails));
            } else {
                System.out.println("Student " + studentId + " is not enrolled in " + className + ".");
            }
        } else {
            System.out.println("Classroom " + className + " does not exist.");
        }
        System.out.println();
    }
}

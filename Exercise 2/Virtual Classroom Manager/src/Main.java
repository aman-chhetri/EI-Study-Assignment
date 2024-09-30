import manager.VirtualClassroomManager;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VirtualClassroomManager manager = new VirtualClassroomManager();
        Scanner scanner = new Scanner(System.in);
        String input;

        try {
            // Display a welcome message and navigation instructions
            System.out.println("=========================================");
            System.out.println(" Welcome to the Virtual Classroom Manager ");
            System.out.println("=========================================");
            System.out.println();
            System.out.println("This is a terminal-based application to manage virtual classrooms, students, and assignments.");
            System.out.println("Here are the available commands:");
            System.out.println();
            System.out.println("1. Add a Classroom: add_classroom <class_name>");
            System.out.println("2. Remove a Classroom: remove_classroom <class_name>");
            System.out.println("3. List Classrooms: list_classrooms");
            System.out.println("4. Add a Student: add_student <student_id> <class_name>");
            System.out.println("5. List Students in a Classroom: list_students <class_name>");
            System.out.println("6. Schedule an Assignment: schedule_assignment <class_name> <assignment_details>");
            System.out.println("7. Submit an Assignment: submit_assignment <student_id> <class_name> <assignment_details>");
            System.out.println("8. Exit the Program: exit");
            System.out.println();
            System.out.println("=======================================");
            System.out.println("Please enter your commands below:");
            System.out.println();

            // Main loop to handle user input
            while (true) {
                input = scanner.nextLine();
                String[] command = input.split(" ", 2);

                switch (command[0]) {
                    case "add_classroom":
                        manager.addClassroom(command[1]);
                        break;
                    case "remove_classroom":
                        manager.removeClassroom(command[1]);
                        break;
                    case "list_classrooms":
                        manager.listClassrooms();
                        break;
                    case "add_student":
                        String[] studentDetails = command[1].split(" ");
                        manager.addStudent(studentDetails[0], studentDetails[1]);
                        break;
                    case "list_students":
                        manager.listStudents(command[1]);
                        break;
                    case "schedule_assignment":
                        String[] assignmentDetails = command[1].split(" ", 2);
                        manager.scheduleAssignment(assignmentDetails[0], assignmentDetails[1]);
                        break;
                    case "submit_assignment":
                        String[] submissionDetails = command[1].split(" ", 3);
                        manager.submitAssignment(submissionDetails[0], submissionDetails[1], submissionDetails[2]);
                        break;
                    case "exit":
                        System.out.println("Exiting the app...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid command");
                        System.out.println();
                }
            }
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}

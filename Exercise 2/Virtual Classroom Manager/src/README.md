# 📝 Exercise 2: Virtual Classroom Manager Application

## Overview
This project is a Virtual Classroom Manager Application implemented in Java. The application workflow goes on like this:

### User Input
1. **Add Classroom:** User types `add_classroom` followed by the class name to create a new virtual classroom.
2. **Add Student:** User types `add_student` followed by the student ID and the class name to enroll a student in a classroom.
3. **Schedule Assignment:** User types `schedule_assignment` followed by class name and assignment details to add an assignment for a
class.
4. **Submit Assignment:** User types `submit_assignment` followed by student ID, class name, and assignment details to mark an
assignment as submitted.


### Console Output
-  **Classroom Addition:** "Classroom [Name] has been created."
- **Student Addition:** "Student [ID] has been enrolled in [Class Name]."
- **Assignment Scheduled:** "Assignment for [Class Name] has been scheduled."
- **Assignment Submission:** "Assignment submitted by Student [ID] in [Class Name]."


### Functional Requirements
1. **Classroom Management:** Ability to add, list, and remove virtual classrooms.
2. **Student Management:** Ability to enroll students into classrooms, and list students in each classroom.
3. **Assignment Management:** Schedule assignments for classrooms and allow students to submit them.


## How to Run

1. Navigate to the directory:
    ```bash
    cd Exercise 2/Virtual Classroom Manager/src
    ```
2. Compile the Java files:
    ```bash
    javac Main.java
    ```
3. Run the application:
    ```bash
    java Main
    ```

### Sample Commands

1. **Add a Classroom:** `add_classroom <class_name>`
2. **Remove a Classroom:** `remove_classroom <class_name>`
3. **List Classrooms:** `list_classrooms`
4. **Add a Student:** `add_student <student_id> <class_name>`
5. **List Students in a Classroom:** `list_students <class_name>`
6. **Schedule an Assignment:** `schedule_assignment <class_name> <assignment_details>`
7. **Submit an Assignment:** `submit_assignment <student_id> <class_name> <assignment_details>`
8. **Exit the Program:** `exit`

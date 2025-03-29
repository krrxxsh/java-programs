import java.util.Scanner;

class Student {
String id;
String name;
int age;
String grade;
String email;

    public Student(String id, String name, int age, String grade, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.email = email;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getGrade() { return grade; }
    public String getEmail() { return email; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setGrade(String grade) { this.grade = grade; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public String toString() {
        return "ID: " + id + 
               "\nName: " + name + 
               "\nAge: " + age + 
               "\nGrade: " + grade + 
               "\nEmail: " + email + "\n";
    }
}

public class StudentManagementSystem {
     static final int MAX_STUDENTS = 100;
     static Student[] students = new Student[MAX_STUDENTS];
     static int studentCount = 0;
     static Scanner scanner = new Scanner(System.in);
     static int studentCounter = 1000;

    public static void main(String[] args) {
        System.out.println("Welcome to Student Management System");

        while (true) {
            System.out.println("\nMain Menu:");
            System.out.println("1. Add New Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student Details");
            System.out.println("4. Delete Student");
            System.out.println("5. Search Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewAllStudents();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    searchStudent();
                    break;
                case 6:
                    System.out.println("Thank you for using Student Management System. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addStudent() {
        if (studentCount >= MAX_STUDENTS) {
            System.out.println("Maximum number of students reached!");
            return;
        }
        
        System.out.println("\nAdd New Student");
        
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        System.out.print("Enter student grade: ");
        String grade = scanner.nextLine();
        
        System.out.print("Enter student email: ");
        String email = scanner.nextLine();

        String id = "STU" + studentCounter++;
        Student newStudent = new Student(id, name, age, grade, email);
        students[studentCount++] = newStudent;

        System.out.println("\nStudent added successfully!");
        System.out.println("Student ID: " + id);
    }

    private static void viewAllStudents() {
        System.out.println("\nAll Students:");
        if (studentCount == 0) {
            System.out.println("No students found.");
            return;
        }
        else{
        
        for (int i = 0; i < studentCount; i++) {
            System.out.println(students[i]);
            System.out.println("-------------------");
        }
        }
    }

    private static void updateStudent() {
        System.out.print("\nEnter student ID to update: ");
        String id = scanner.nextLine();
        
        int index = findStudentIndex(id);
        if (index == -1) {
            System.out.println("Student not found.");
            return;
        }
        else{
        Student student = students[index];
        System.out.println("\nCurrent Details:");
        System.out.println(student);
        
        System.out.println("\nEnter new details (leave blank to keep current):");
        
        System.out.print("Name (" + student.getName() + "): ");
        String name = scanner.nextLine();
        if (!name.isEmpty()) student.setName(name);
        
        System.out.print("Age (" + student.getAge() + "): ");
        String ageInput = scanner.nextLine();
        if (!ageInput.isEmpty()) student.setAge(Integer.parseInt(ageInput));
        
        System.out.print("Grade (" + student.getGrade() + "): ");
        String grade = scanner.nextLine();
        if (!grade.isEmpty()) student.setGrade(grade);
        
        System.out.print("Email (" + student.getEmail() + "): ");
        String email = scanner.nextLine();
        if (!email.isEmpty()) student.setEmail(email);
        
        System.out.println("\nStudent details updated successfully!");
    }
    }
    private static void deleteStudent() {
        System.out.print("\nEnter student ID to delete: ");
        String id = scanner.nextLine();
        
        int index = findStudentIndex(id);
        if (index == -1) {
            System.out.println("Student not found.");
            return;
        }
        
     
        for (int i = index; i < studentCount - 1; i++) {
            students[i] = students[i + 1];
        }
        
        students[studentCount - 1] = null; 
        studentCount--;
        
        System.out.println("Student with ID " + id + " deleted successfully.");
    }

    private static void searchStudent() {
        System.out.print("\nEnter student ID to search: ");
        String id = scanner.nextLine();
        
        int index = findStudentIndex(id);
        if (index == -1) {
            System.out.println("Student not found.");
            return;
        }
        else{
        
        System.out.println("\nStudent Details:");
        System.out.println(students[index]);
        }
    }

    private static int findStudentIndex(String id) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getId().equalsIgnoreCase(id)) {
                return i;
            }
            
        }
        return -1;
    }
}
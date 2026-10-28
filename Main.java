import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. List Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");

            System.out.print("Choose an option: ");
            int choice = input.nextInt();
            input.nextLine();

            if (choice == 4) {
                System.out.println("Goodbye!");
                break;
            }

            if (choice == 1) {
                System.out.print("Enter student name: ");
                String name = input.nextLine();

                System.out.print("Enter first exam grade: ");
                int grade1 = input.nextInt();

                System.out.print("Enter second exam grade: ");
                int grade2 = input.nextInt();

                System.out.print("Enter third exam grade: ");
                int grade3 = input.nextInt();
                input.nextLine();

                Student student = new Student(name, grade1, grade2, grade3);
                students.add(student);

                System.out.println("Student added successfully!");

            } else if (choice == 2) {

                if (students.isEmpty()) {
                    System.out.println("No students have been added yet.");
                } else {
                    System.out.println("\n===== STUDENT LIST =====");

                    for (Student student : students) {
                        System.out.println("\nStudent: " + student.name);
                        System.out.println("First grade: " + student.grade1);
                        System.out.println("Second grade: " + student.grade2);
                        System.out.println("Third grade: " + student.grade3);

                        double average = student.calculateAverage();
                        System.out.printf("Average: %.2f%n", average);

                        if (average >= 50) {
                            System.out.println("Status: Passed");
                        } else {
                            System.out.println("Status: Failed");
                        }
                    }
                }

            } else if (choice == 3) {

                System.out.print("Enter student name to search: ");
                String searchName = input.nextLine();

                boolean found = false;

                for (Student student : students) {
                    if (student.name.equalsIgnoreCase(searchName)) {
                        System.out.println("\n===== STUDENT FOUND =====");
                        System.out.println("Student: " + student.name);
                        System.out.println("First grade: " + student.grade1);
                        System.out.println("Second grade: " + student.grade2);
                        System.out.println("Third grade: " + student.grade3);
                        System.out.printf("Average: %.2f%n",
                                student.calculateAverage());

                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Student not found!");
                }

            } else {
                System.out.println("Invalid choice! Please select 1, 2, 3 or 4.");
            }
        }

        input.close();
    }
}
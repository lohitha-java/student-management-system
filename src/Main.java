import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Student> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Delete Student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            if (choice == 1) {
                addStudent();
            }
            else if (choice == 2) {
                showStudents();
            }
            else if (choice == 3) {
                deleteStudent();
            }
            else if (choice == 4) {
                System.out.println("Program closed");
                break;
            }
            else {
                System.out.println("Invalid choice");
            }
        }
    }

    // ADD STUDENT
    static void addStudent() {

        System.out.print("Enter id: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        System.out.print("Enter course: ");
        String course = sc.nextLine();

        Student st = new Student(id, name, email, course);
        list.add(st);

        System.out.println("Student added successfully");
    }

    // VIEW STUDENTS
    static void showStudents() {

        if (list.size() == 0) {
            System.out.println("No students available");
        }
        else {
            System.out.println("\nID  Name  Email  Course");
            for (Student s : list) {
                System.out.println(
                        s.id + "  " + s.name + "  " + s.email + "  " + s.course
                );
            }
        }
    }

    // DELETE STUDENT
    static void deleteStudent() {

        System.out.print("Enter student id to delete: ");
        int id = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).id == id) {
                list.remove(i);
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Student deleted successfully");
        }
        else {
            System.out.println("Student not found");
        }
    }
}

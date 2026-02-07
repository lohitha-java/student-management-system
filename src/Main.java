import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Student> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1 Add Student");
            System.out.println("2 View Students");
            System.out.println("3 Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            if (choice == 1) {
                addStudent();
            } 
            else if (choice == 2) {
                showStudents();
            } 
            else if (choice == 3) {
                System.out.println("Program closed");
                break;
            } 
            else {
                System.out.println("Wrong choice");
            }
        }
    }

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

        System.out.println("Student added");
    }

    static void showStudents() {

        if (list.size() == 0) {
            System.out.println("No students available");
        } 
        else {
            for (int i = 0; i < list.size(); i++) {
                Student s = list.get(i);
                System.out.println(
                    s.id + " " + s.name + " " + s.email + " " + s.course
                );
            }
        }
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        StudentManagement management = new StudentManagement();

        while (true) {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    Student student = new Student(id, name, age, course);

                    management.addStudent(student);
                    break;

                case 2:

                    management.viewStudents();
                    break;

                case 3:

                    System.out.print("Enter Student ID: ");
                    int searchId = sc.nextInt();

                    Student found = management.searchStudent(searchId);

                    if (found != null) {
                        System.out.println("\nStudent Found");
                        System.out.println(found);
                    } else {
                        System.out.println("Student not found.");
                    }

                    break;

                case 4:

                    System.out.print("Enter Student ID to Update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter New Age: ");
                    int newAge = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Course: ");
                    String newCourse = sc.nextLine();

                    if (management.updateStudent(updateId, newName, newAge, newCourse)) {
                        System.out.println("Student updated successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }

                    break;

                case 5:

                    System.out.print("Enter Student ID to Delete: ");
                    int deleteId = sc.nextInt();

                    if (management.deleteStudent(deleteId)) {
                        System.out.println("Student deleted successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }

                    break;

                case 6:

                    System.out.println("Thank you for using Student Management System.");
                    sc.close();
                    System.exit(0);

                default:

                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
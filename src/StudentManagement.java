import java.util.ArrayList;

public class StudentManagement {

    private ArrayList<Student> students = new ArrayList<>();

    // Add Student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    // View Students
    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }

        System.out.println("\n===== Student List =====");

        for (Student student : students) {
            System.out.println(student);
            System.out.println("-----------------------");
        }
    }

    // Search Student
    public Student searchStudent(int id) {

        for (Student student : students) {

            if (student.getId() == id) {
                return student;
            }
        }

        return null;
    }

    // Update Student
    public boolean updateStudent(int id, String name, int age, String course) {

        Student student = searchStudent(id);

        if (student != null) {

            student.setName(name);
            student.setAge(age);
            student.setCourse(course);

            return true;
        }

        return false;
    }

    // Delete Student
    public boolean deleteStudent(int id) {

        Student student = searchStudent(id);

        if (student != null) {

            students.remove(student);

            return true;
        }

        return false;
    }
}
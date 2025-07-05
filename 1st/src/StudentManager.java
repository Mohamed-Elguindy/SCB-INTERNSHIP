import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class StudentManager {
    private Map<Integer, Student> students = new HashMap<>();

    public void addStudent(int id, String name, int age, int grade) {
        if (id < 0 || name == null || age < 0 || grade < 0) {
            System.out.println("Invalid Input");
        } else if (students.containsKey(id)) {
            System.out.println("Student already exists.");
        } else {
            students.put(id, new Student(id, name, age, grade));
        }
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student s : students.values()) {
                s.Print();
                System.out.println("----------------------");
            }
        }
    }

    public void printTop5Students() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            students.values().stream()
                    .sorted(Comparator.comparingInt(Student::getGrade).reversed())
                    .limit(5)
                    .forEach(s -> {
                        s.Print();
                        System.out.println("----------------------");
                    });
        }
    }
}

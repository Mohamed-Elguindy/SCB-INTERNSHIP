import java.util.*;

public class Mange {
    private Map<Integer, Student> Students = new HashMap<>();

    public void addStudents(int id, String name, int grade) {
        
        
        if (id < 0 || name == null || grade < 0)
        {
            System.out.println("Invalid Input");

        }
        else if (Students.containsKey(id)) {
            System.out.println("Student already exists.");

        }
        else {
            Students.put(id,new Student(id, name, grade));
        }
    }
    public void displayAllStudents() {
        if (Students.isEmpty()) {
            System.out.println("No students found.");
        }
        else {
            for (Student s : Students.values()) {
                s.Print_Student();
            }
        }
    }
    public void printTop5Students() {
        if (Students.isEmpty()) {
            System.out.println("No students found.");
        }
        else {
            Students.values().stream().
                    sorted(Comparator.comparingInt(Student::getGrade).reversed())
                    .limit(5).forEach(Student::Print_Student);
        }

    }


}


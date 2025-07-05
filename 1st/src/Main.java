public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();

        studentManager.addStudent(1, "Alice", 18, 95);
        studentManager.addStudent(2, "Bob", 17, 89);
        studentManager.addStudent(3, "Charlie", 19, 76);
        studentManager.addStudent(4, "David", 18, 88);
        studentManager.addStudent(5, "Eve", 20, 91);
        studentManager.addStudent(6, "Frank", 17, 85);

        System.out.println("=== All Students ===");
        studentManager.displayAllStudents();

        System.out.println("\n=== Top 5 Students ===");
        studentManager.printTop5Students();

        StaffManager staffManager = new StaffManager();

        staffManager.addStaff(101, "Dr. Smith", 45, "Professor", 12000);
        staffManager.addStaff(102, "Ms. Johnson", 38, "Admin", 8500);
        staffManager.addStaff(103, "Mr. Clark", 50, "Dean", 15000);
        staffManager.addStaff(104, "Mrs. Lee", 42, "Lecturer", 10000);

        System.out.println("\n=== All Staff ===");
        staffManager.displayAllStaff();

        System.out.println("\n=== Top Salaries (Staff) ===");
        staffManager.printTopSalaries();
    }
}

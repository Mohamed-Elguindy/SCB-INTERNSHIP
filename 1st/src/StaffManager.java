import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class StaffManager {
    private Map<Integer, Staff> staffMembers = new HashMap<>();

    public void addStaff(int id, String name, int age, String role, double salary) {
        if (id < 0 || name == null || age < 0 || role == null || salary < 0) {
            System.out.println("Invalid Input");
        } else if (staffMembers.containsKey(id)) {
            System.out.println("Staff already exists.");
        } else {
            staffMembers.put(id, new Staff(id, name, age, role, salary));
        }
    }

    public void displayAllStaff() {
        if (staffMembers.isEmpty()) {
            System.out.println("No staff found.");
        } else {
            for (Staff s : staffMembers.values()) {
                s.Print();
                System.out.println("----------------------");
            }
        }
    }

    public void printTopSalaries() {
        if (staffMembers.isEmpty()) {
            System.out.println("No staff found.");
        } else {
            staffMembers.values().stream()
                    .sorted(Comparator.comparingDouble(Staff::getSalary).reversed())
                    .forEach(s -> {
                        s.Print();
                        System.out.println("----------------------");
                    });
        }
    }
}

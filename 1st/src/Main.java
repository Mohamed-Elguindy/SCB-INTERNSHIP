import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Mange manager = new Mange();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Show Top 5 Students");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();

                        System.out.print("Enter Grade: ");
                        int grade = scanner.nextInt();
                        scanner.nextLine();

                        manager.addStudents(id, name, grade);
                    } catch (Exception e) {
                        System.out.println("Invalid input.");
                        scanner.nextLine();
                    }
                    break;

                case 2:
                    manager.displayAllStudents();
                    break;

                case 3:
                    manager.printTop5Students();
                    break;

                case 4:
                    System.out.println("Exiting program");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

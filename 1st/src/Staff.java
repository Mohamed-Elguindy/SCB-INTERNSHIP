public class Staff extends Person {
    private String role;
    private double salary;

    public Staff(int id, String name, int age, String role, double salary) {
        super(id, name, age);
        this.role = role;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void Print() {
        super.Print();
        System.out.println("Role : " + role);
        System.out.println("Salary : " + salary);
    }
}

public class Student extends Person {
    private int grade;

    public Student(int id, String name, int age, int grade) {
        super(id, name, age);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void Print() {
        super.Print();
        System.out.println("Grade : " + grade);
    }
}

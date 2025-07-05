public abstract class Person {
    private int id;
    private String name;
    private int age;
    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public int getId() {return id;}
    public String getName() {return name;}
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public void setId(int id) {this.id = id;}
    public void setName(String name) {this.name = name;}

    public void Print() {
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}

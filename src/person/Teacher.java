package person;

public class Teacher extends Person {
    public String position;
    public int salary;

    public Teacher(String name, int age, String position, int salary) {
        super(name, age);
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}

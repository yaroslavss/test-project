import person.Person;
import person.Student;
import person.Teacher;

public class Loader {
    public static void main(String[] args) {
        Person p1 = new Student("Василий Пупкин", 25, 1);
        Person p2 = new Teacher("Иван Иванович Иванов", 55, "доцент", 85000);

        Person[] persons = {p1, p2};

        for (Person p: persons)
            System.out.println(p);
    }
}

import person.Person;
import person.Student;
import person.Teacher;

import java.util.Arrays;
import java.util.Comparator;

public class Loader {
    public static void main(String[] args) {
        Person p1 = new Student("Василий Пупкин", 25, 1);
        Person p2 = new Teacher("Иван Иванович Иванов", 55, "профессор", 85000);
        Person p3 = new Teacher("Петр Петрович Петров", 35, "доцент", 55000);

        Person[] persons = {p1, p2, p3};

        Arrays.sort(persons, new Comparator<>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.age - p2.age;
            }
        });

        for (Person p: persons)
            System.out.println(p);
    }
}

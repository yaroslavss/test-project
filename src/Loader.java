import person.Person;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Comparator;

public class Loader {
    public static void main(String[] args) throws ParseException {
        Person p1 = new Person("Василий Пупкин", "25.03.2001");
        Person p2 = new Person("Иван Иванович Иванов", "01.08.1965");
        Person p3 = new Person("Петр Петрович Петров", "25.02.1978");

        Person[] persons = {p1, p2, p3};

        Arrays.sort(persons, new Comparator<>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p2.getBirthday().compareTo(p1.getBirthday());
            }
        });

        for (Person p: persons)
            System.out.println(p);
    }
}

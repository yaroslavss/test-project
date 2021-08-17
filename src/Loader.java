import person.Person;
import robot.Robot;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Loader {
    public static void main(String[] args) {
        Person p1 = null;
        Person p2 = null;
        Person p3 = null;

        try {
            p1 = new Person("Пупкин Василий", LocalDate.parse("2005-08-14"));
            p2 = new Person("Петров Петр Петрович", LocalDate.parse("1965-06-28"));
            p3 = new Person("Иванов Иван Иванович", LocalDate.parse("1975-02-18"));
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        List<Person> personsList = new ArrayList<>();
        personsList.add(p1);
        personsList.add(p2);
        personsList.add(p3);

        personsList.stream().
                filter(o -> o.calculateAge() >= 18).
                sorted((o1,o2) -> o1.getName().compareTo(o2.getName())).
                forEach(System.out::println);
    }
}

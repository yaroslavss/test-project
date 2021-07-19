import person.Person;

import java.text.ParseException;
import java.util.Map;
import java.util.TreeMap;

public class Loader {
    public static void main(String[] args) {
        Person p1 = null,
               p2 = null,
               p3 = null;

        try {
            p1 = new Person("Пупкин Василий", "25.03.2001");
            p2 = new Person("Иванов Иван Иванович", "01.08.1965");
            p3 = new Person("Петров Петр", "25.02.2002");
        } catch (ParseException e) {
            System.out.println("Неправильно задана дата: " + e.getMessage());
        }

        TreeMap<Person, Integer> personsMap = new TreeMap<>();

        personsMap.put(p1, 0);
        personsMap.put(p2, 0);
        personsMap.put(p3, 0);

        System.out.println(personsMap);

        // use Stream API to find border person
        Person firstYoungPerson = personsMap.navigableKeySet().stream().filter(person -> person.getYear()>2000).findFirst().get();

        Map<Person, Integer> youngPersonsMap = personsMap.tailMap(firstYoungPerson);

        System.out.println(youngPersonsMap);
    }
}

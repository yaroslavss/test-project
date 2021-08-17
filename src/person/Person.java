package person;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Person {
    private final String name;
    private final LocalDate birthday;

    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public int calculateAge() {
        return Period.between(birthday, LocalDate.now()).getYears();
    }

    public String formatBirthday(String format) {
        return birthday.format(DateTimeFormatter.ofPattern(format));
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + formatBirthday("dd MMMM yyyy") +
                '}';
    }
}

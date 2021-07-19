package person;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Person implements Comparable<Person> {
    private String name;
    private Calendar birthday;

    public Person(String name, String strDate) throws ParseException {
        this.name = name;
        setBirthday(strDate);
    }

    public void setBirthday(String strDate) throws ParseException {
        DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        Date date = formatter.parse(strDate);
        birthday = Calendar.getInstance();
        birthday.setTime(date);
    }

    public Calendar getBirthday() {
        return birthday;
    }

    public int getYear() {
        return birthday.get(Calendar.YEAR);
    }

    public String formatBirthday(String format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(birthday.getTime());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + formatBirthday("dd MMMM yyyy") +
                '}';
    }

    @Override
    public int compareTo(Person p) {
        return getBirthday().compareTo(p.getBirthday());
    }
}

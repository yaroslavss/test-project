package person;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Person {
    private String name;
    private Calendar birthday;

    public Person(String name, String strDate) throws ParseException {
        this.name = name;
        setBirthday(strDate);
    }

    public void setBirthday(String strDate) throws ParseException {
        DateFormat formatter  = new SimpleDateFormat("dd.MM.yyyy");
        Date date  = formatter.parse(strDate);
        birthday = Calendar.getInstance();
        birthday.setTime(date);
    }

    public Calendar getBirthday() {
        return birthday;
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
}

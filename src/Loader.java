import java.util.Scanner;

public class Loader {
    // RegExp
    private static final String REGEXP = "(\\d)(?=(\\d{3})+(?!\\d))";
    // delimiter
    private static final String DELIMITER = " ";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            String output = Integer.toString(number).replaceAll(REGEXP, "$1"+DELIMITER);
            System.out.println(output);
        } else {
            System.out.println("Ошибка, это не число. Перезапустите программу и попробуйте снова!");
        }
    }
}

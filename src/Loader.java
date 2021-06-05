public class Loader {
    // input string
    private static final String INPUT = "12345678.54";
    // RegExp
    private static final String REGEXP = "(\\d)(?=(\\d{3})+(?!\\d))";
    // delimiter
    private static final String DELIMITER = " ";

    public static void main(String[] args) {
        String output = INPUT.replaceAll(REGEXP, "$1"+DELIMITER);
        System.out.println(output);
    }
}

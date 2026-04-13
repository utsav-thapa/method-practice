public class Format {
    public static void main(String[] args) {
        String firstName = "Dave";
        String lastName = "Dykes";
        System.out.println(formatName(firstName,lastName));

    }

    public static String formatName(String first, String last) {
        String name = last + " " + first;
        return name;


    }
}

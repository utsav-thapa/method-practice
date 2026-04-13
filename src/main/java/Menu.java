public class Menu {
    public static void main(String[] args) {
        displayMenu();
        displayMenu();
    }

    public static void displayMenu() {
        String menu = """
                1. Coffee - $3.99
                2. Tea - $2.99
                3. Cookie - $1.99""";
        System.out.println(menu);
    }


}


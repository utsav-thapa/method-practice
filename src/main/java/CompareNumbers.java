public class CompareNumbers {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println("Is " + a + " even? " + isEven(a));
        System.out.println("Is " + a + " odd? " +isOdd(a));
        System.out.println("Is " + b + " even? " +isEven(b));
        System.out.println("Is " + b + " odd? " +isOdd(b));
        }

    public static boolean isEven(int number1) {
        if (number1 % 2 == 0) {
            return true;
        }
        else {
            return false; }
    }
    public static boolean isOdd(int number2) {
        if (number2 % 2 != 0){
            return true;
        } else { return false; }
    }
}

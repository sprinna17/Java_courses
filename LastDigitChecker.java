public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println("Numbers have the same last digits --> " + hasSameLastDigit(197, 123, 983) + ", this digit is... "); // range [10; 1000]
    }
    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {

        if (!isValid(a) || !isValid(b) || !isValid(c)) {
            return false;
        }

        int lastA = a % 10;
        int lastB = b % 10;
        int lastC = c % 10;
        return (lastA == lastB) || (lastA == lastC) || (lastB == lastC);
    }
}

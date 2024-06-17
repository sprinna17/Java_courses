public class FactorPrinter {
    public static void main(String[] args) {
        System.out.println("This number is correct --> " + printFactors(10));

    }

    public static boolean printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid value! Parameter should be more than 1");
            return false;
        }

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
        return true;
    }
}

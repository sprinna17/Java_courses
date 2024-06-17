public class DecimalComparator {
    public static void main(String[] args) {
        boolean result = areEqualByThreeDecimalPlaces(-3.175, 3.175);
        System.out.println("There are two parameters -> " + result);
    }

    public static boolean areEqualByThreeDecimalPlaces(double parameter1, double parameter2) {
        long firstRounded = (long) (parameter1 * 1000);
        long secondRounded = (long) (parameter2 * 1000);
        return firstRounded == secondRounded;

    }
}



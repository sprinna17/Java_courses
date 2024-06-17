public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println("Greatest Common Factor(=GCF) for both numbers is --> " + getGreatestCommonDivisor(10,30));

    }

    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        }

        int min = first < second ? first : second;
        int gcd = 1;
        for (int j = 1; j <= min; j++) {
            if (first % j == 0 && second % j == 0) {
                gcd = j;
            }
        }
        return gcd;
    }

}

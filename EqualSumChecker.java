public class EqualSumChecker {
    public static void main(String[] args) {
        int parameter1 = 50;
        int parameter2 = 40;
        int parameter3 = 90;

        boolean result = hasEqualSum(parameter1,parameter2,parameter3);

        System.out.println("The sum of parameter N1 & N2 -> " + result);
    }

    public static boolean hasEqualSum(int parameter1, int parameter2, int parameter3) {

        if ((parameter1 + parameter2) == parameter3) {
            System.out.println(parameter1 + " + " + parameter2 + " = " + parameter3);
            return true;
        }
        else {
            System.out.println(parameter1 + " + " + parameter2 + " != " + parameter3);
            return false;
        }

    }


}

// CODE FORM UDEMY+
//public class EqualSumChecker {
//
//    public static boolean hasEqualSum(int a, int b, int c) {
//        return (a + b) == c;
//    }
//}
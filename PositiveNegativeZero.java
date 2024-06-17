import javax.swing.*;
public class PositiveNegativeZero {
    public static void main(String[] args) {

        String result = checkNumber(1000);
        System.out.println("This number is " + result);

    }

    public static String checkNumber(int number) {
        String positive = "positive";
        String negative = "negative";
        String zero     = "zero";

        if (number > 0) {
            return positive;
        } else if (number < 0) {
            return negative;
        } else {
            return zero;
        }
    }
}

//__________________________2nd method Udemy.com__________________________
//public class PositiveNegativeZero {
//
//    public static void main(String[] args) {
//    }
//
//    public static void checkNumber(int number) {
//        if (number > 0)
//            System.out.println("positive");
//        else if (number < 0)
//            System.out.println("negative");
//        else
//            System.out.println("zero");
//    }
//}

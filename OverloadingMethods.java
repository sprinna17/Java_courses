public class OverloadingMethods {
    public static void main(String[] args) {
        double result = convertToCentimeters(1);
        System.out.println("The number has -> " + result + " cm");
        double result2 = convertToCentimeters(5,8);
        System.out.println("The number has foot + inches -> " + result2 + " cm");
    }

    public static double convertToCentimeters(int inches) {
        double centimeters = inches * 2.54;
        return centimeters;
    }

    public static double convertToCentimeters(int feet, int inches) {
        //return ((feet * 12 + inches) * 2.54);
        return convertToCentimeters((feet * 12) + inches);
    }

}

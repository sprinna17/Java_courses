public class AreaCalculator {

    public static void main(String[] args) {
        System.out.println(area(-5));
        System.out.println(area(5,4));
    }
    private static final int INVALID_VALUE = -1;
    public static double area(double radius) {
        if (radius < 0) {
            System.out.println("Invalid value! Parameter should be positive.");
            //return -1.0;
            return INVALID_VALUE;
        }
        double result = 3.14 * Math.pow(radius,2);
        return result;

    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            System.out.println("Invalid value! Parameter should be positive.");
           // return -1.0;
            return INVALID_VALUE;
        }
        double result = x * y;
        return result;
    }
}

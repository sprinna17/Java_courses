public class SpeedConverter {
    public static void main(String[] args) {

        double calculatedValue = toMilesPerHour(75.114);
        System.out.println("This calculation is " + Math.round(calculatedValue));
    }

    public static double toMilesPerHour(double kilometersPerHour) {
        int error = -1;
        double result;

        if (kilometersPerHour > 0) {
            result = kilometersPerHour * 0.621;
            return result;
        }
        else {
            return error;
        }


    }

}



//__________________________2nd method Udemy.com__________________________
//public class SpeedConverter {
//
//    public static long toMilesPerHour(double kilometersPerHour) {
//
//        if (kilometersPerHour < 0) {
//            return -1;
//        }
//        return Math.round(kilometersPerHour / 1.609);
//    }
//
//    public static void printConversion(double kilometersPerHour) {
//
//        if (kilometersPerHour < 0) {
//            System.out.println("Invalid Value");
//            return;
//        }
//        long milesPerHour = toMilesPerHour(kilometersPerHour);
//        System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
//    }
//}

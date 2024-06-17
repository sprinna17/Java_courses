public class getDurationString {
    public static void main(String[] args) {

        System.out.println(getDurationString(3945));  // This is the first test case
        System.out.println(getDurationString(65, 45));  // This is the second test case

    }

    public static String getDurationString(int seconds) {
        // Two step approach
//        int minutes = seconds / 60;
//        int hours   = minutes / 60;
//        System.out.println("hours = " + hours);

        // One step approach
//        int hours1 = seconds / 3600;
//        System.out.println("hours1 = " + hours1);
//        return getDurationString(minutes, seconds);

        // Final approach
        int minutes = seconds / 60;
        return getDurationString(minutes, seconds);
    }

        public static String getDurationString(int minutes, int seconds) {

            int hours = minutes / 60;

            int remainingMinutes = minutes % 60;
            int remainingSeconds = seconds % 60;

            return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
        }
}

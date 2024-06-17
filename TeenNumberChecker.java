public class TeenNumberChecker {
    public static void main(String[] args) {

        boolean result = hasTeen(12);
        System.out.println("The person is teenager -> " + result);
    }
        public static boolean hasTeen(int par3) {
            int par1 = 13;
            int par2 = 19;
            return (par3 >= par1 && par3 <= par2);

        }

}

// CODE de UDEMY
//public class TeenNumberChecker {
//
//    public static boolean hasTeen(int a, int b, int c) {
//        return isTeen(a) || isTeen(b) || isTeen(c);
//    }
//
//    public static boolean isTeen(int number) {
//        return number > 12 && number < 20;
//    }
//}


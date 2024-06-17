public class NumberInWord {
    public static void main(String[] args) {
        printNumberInWord(2);
    }

    public static void printNumberInWord(int number) {
//        if (number < 0) {
//            System.out.println("Invalid value! Parameter should be positive.");
//            return;
//        }
        String numberInWord;
        switch (number) {
            case 0 -> numberInWord = "ZERO";
            case 1 -> numberInWord = "ONE";
            case 2 -> numberInWord = "TWO";
            case 3 -> numberInWord = "THREE";
            case 4 -> numberInWord = "FOUR";
            case 5 -> numberInWord = "FIVE";
            case 6 -> numberInWord = "SIX";
            case 7 -> numberInWord = "SEVEN";
            case 8 -> numberInWord = "EIGHT";
            case 9 -> numberInWord = "NINE";
            default -> numberInWord = "OTHER";
        }
        System.out.println(numberInWord);

    }

}

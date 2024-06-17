public class MethodChallengeTest {
    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Nataliia", highScorePosition);

        highScorePosition = calculateHighScorePosition(999);
        displayHighScorePosition("Kirai", highScorePosition);

        highScorePosition = calculateHighScorePosition(499);
        displayHighScorePosition("Nastya", highScorePosition);

        highScorePosition = calculateHighScorePosition(99);
        displayHighScorePosition("Igor", highScorePosition);

        highScorePosition = calculateHighScorePosition(-11);
        displayHighScorePosition("Lex", highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " manage to get into position " + highScorePosition + " on the high list");
    }


//    public static int calculateHighScorePosition(int playerScore) {
//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500 && playerScore < 1000) {
//            return 2;
//        } else if (playerScore >=100 && playerScore < 500) {
//            return 3;
//        } else {
//            return 4;
//        }
//    }


    public static int calculateHighScorePosition(int playerScore) {   //2nd variant of write optimize code

        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }

        return position;
    }
}

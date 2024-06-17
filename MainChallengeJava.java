public class MainChallengeJava {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//  This is code for method
        calculateScore(gameOver, score, levelCompleted, bonus);

//  This is code for 2nd call of method
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
//       calculateScore(true, 10000, 8,200);
        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("The highScore is " + highScore);

//  This is calling method + println()
        score = 10;
        levelCompleted = 2;
        bonus = 1;
        System.out.println("The next highScore is " +
                calculateScore(gameOver, score, levelCompleted, bonus));

    }


    //public static void calculateScore() {  //this is another one method without arg-s
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }

        return finalScore;
    }


}

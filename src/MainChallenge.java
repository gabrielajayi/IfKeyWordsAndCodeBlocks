public class MainChallenge {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        int finalScore = score;

        if (gameOver == true) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        boolean newGameOver = true;
        int newScore = 12000;
        int newLevelCompleted = 12;
        int newBonus = 1200;

        int newFinalScore = newScore;

        if (newGameOver == true) {
            newFinalScore += (newLevelCompleted * newBonus);
            System.out.println("Your final score was " + newFinalScore);
        }
    }
}
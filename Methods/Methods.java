public class Methods {
    public static void main(String[] args) {
        boolean gameOver = false;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        // To run method, call it inside main function
        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        // We can also override the default values with custom info (in this case you don't *have* to define any variables)
        calculateScore(true, 1000, 10, 200);

        // Or update the variable values explicitly right before the call
        gameOver = true;
        score = 2000;
        levelCompleted = 20;
        bonus = 300;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        int position = calculateHighScorePosition(1000);
        displayHighScorePosition("Daniel", position);

        position = calculateHighScorePosition(500);
        displayHighScorePosition("Alexia", position);

        position = calculateHighScorePosition(250);
        displayHighScorePosition("Esme", position);
    }

    // Void means don't return any values, change to int (specify what should be returned)
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        } else {
            // Can't return text due to int on top, -1 means false
            return -1;
        }
    }

    public static void displayHighScorePosition(String player, int position) {
        System.out.println(player + " got to position " + position);
        
    }

    public static int calculateHighScorePosition(int score) {
        // if (score >= 1000) return 1;
        // else if (score >= 500) return 2;
        // else if (score >= 100) return 3;
        // return 4;

        // Alternate solution that's more explicit
        int position = 4;

        if (score >= 1000) position = 1;
        else if (score >= 500) position = 2;
        else if (score >= 100) position = 3;

        return position;
    } 
}
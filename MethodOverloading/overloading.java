// Method overloading is helpful when we need several similar methods to perform calculation on a variety of differet parameter amounts
// I.e. a code challenge website that calculates user score based on number of challenges in different categories (easy, medium, hard)
// Due to the strict nature of Java syntax RE: a function's parameters and return values, this could indeed be necessary in the wild
// We should NOT use different method names as this is a bad practice, instead it's better to just change the parameters/return vals

public class overloading {
    public static void main(String[] args) {
        int newScore = calculateScore("Daniel", 500);
        System.out.println("New score is " + newScore);

        int secondScore = calculateScore(1000);
        System.out.println("Second score is " + secondScore);

        calculateScore();

        double centimeters = calculateCentimeters(6, 2);
        System.out.println("Daniel is " + centimeters + " centimeters tall.");

        double centimeters2 = calculateCentimeters(74);
        System.out.println("Yep he is still " + centimeters2 + " centimeters.");
    }

    public static int calculateScore(String player, int score) {
        System.out.println("Player " + player + " scored " + score);
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score);
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player, no score");
        return 0;
    }

    // You can't change the return type to duplicate method -- you must change its parameters

    public static double calculateCentimeters(double feet, double inches) {
        if (inches < 0 || feet < 0 || inches > 12) return -1;
        double result = (feet * 12 * 2.54) + (inches * 2.54);
        return result;
    }

    public static double calculateCentimeters(double inches) {
        if (inches < 0) return -1;

        // Must convert so we can insert into previous method
        double feet = (int) inches / 12;
        double rest = (int) inches % 12;
        // Using (int) confirms we get a whole number

        double total = calculateCentimeters(feet, rest);
        
        return total;
    }
}
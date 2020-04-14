
public class OpEx {
    public static void main(String[] args) {
        // Operands are variables used within operator
        int result = 1 + 2;
        // Like Javascript, can use shorthand to increment/decrement
        result++;
        System.out.println(result);

        boolean isAlien = false;
        // Double equal/square bracket optional for if/else in Java
        if (isAlien == false) {
            // Will only run 1 block of code by default without the bracket
            System.out.println("Not an alien");
        }

        int topScore = 95;
        if (topScore == 100) {
            System.out.println("You got the top score!");
        }

        int secondTopScore = 50;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than top and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Conditions are true");
        }

        // Like JS, Python, can use shortcut syntax for booleans
        if (isAlien) {
            System.out.println("Alien");
        }

        // Ternary assigns one of two values depending on condition
        boolean wasAlien = isAlien ? true : false;
        if (wasAlien) {
            System.out.println("Yep");
        }
    }
}
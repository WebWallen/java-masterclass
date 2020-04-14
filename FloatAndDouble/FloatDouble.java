
public class FloatDouble {
    public static void main(String[] args) {
        // Single precision (32 bits/width)
        float myMinFloat = Float.MIN_VALUE;
        float myMaxFloat = Float.MAX_VALUE; 
        // Not as precise as double
        System.out.println("Float max: " + myMaxFloat);
        System.out.println("Float min: " + myMinFloat);

        // Double precision (64 bits/width)
        double myMinDbl = Double.MIN_VALUE;
        double myMaxDbl = Double.MAX_VALUE;
        // Twice as precise as single
        System.out.println("Double max: " + myMaxDbl);
        System.out.println("Double min: " + myMinDbl);

        // Good practice to add letter to be explicitly clear
        int myInt = 5 / 2;
        // No decimals in integer, so it automatically rounds to 2
        float myFloat = 5f / 3f;
        // Float and double have decimals so it will print the correct total (notice the double is more precise due to longer number)
        double myDbl = 5d / 3d;
        // "d" and "f" are not required when you use a literal (5.00 / 3.00)
        System.out.println("Int: " + myInt);
        System.out.println("Float: " + myFloat);
        System.out.println("Double: " + myDbl);
        // Double is the most used due to its more precise nature and helpfulness in methods

        double lbs = 230.00;
        double kg = 230.00 * 0.45359237;
        System.out.println("Daniel weighs " + lbs + " lbs and " + kg + " kg");

        // Note: floating point numbers should not be used when precise calculations are called for
    }
}

public class Main {
    public static void main(String[] args) {
        int myValue = 10000;

        int myMin = Integer.MIN_VALUE;
        // int is a primitive data type
        int myMax = Integer.MAX_VALUE;
        // Integer is a wrapper class that provides operations we can do on this data type
        System.out.println("Max: " + myMax);
        System.out.println("Min: " + myMin);
        // If you go over or under the max/min allowed, it adds/removes (-) and returns reverse
        System.out.println("Overflow: " + (myMax + 1));
        System.out.println("Underflow: " + (myMin - 1));
        // You can add underscores to big numbers if desired to make them more readable
        int bruceWayneSavings = 1_000_000_000;
        // No commas allowed in print statements (at least not with int's)
        System.out.println("Wayne Savings: " + bruceWayneSavings);
    
        // Byte occupies 8 bits ("width of 8")
        byte myMinByte = Byte.MIN_VALUE;
        byte myMaxByte = Byte.MAX_VALUE;
        // Short occupies 16 bits ("width of 16")
        short myMinShort = Short.MIN_VALUE;
        short myMaxShort = Short.MAX_VALUE;
        // Int occupies 32 bits (space within memory)
        long myLong = 100L;
        long myMinLong = Long.MIN_VALUE;
        long myMaxLong = Long.MAX_VALUE;
        // Long occupies 64 bits and requires L at end

        // Numbers within parenthesis automatically get converted to int
        byte myByte = (byte) (myMinByte / 2);
        // We prevent by "casting" or changing its type with a preceding parenthetical
        short myShort = (short) (myMaxShort / 2);
        // This is not required when we are using the long data type
        long longTotal = myLong * (myByte + myShort + myValue);
        // Note: must use double quotes in Java, no single!
        System.out.println("Long total: " + longTotal);
    }
}
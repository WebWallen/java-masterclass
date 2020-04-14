
public class CharBool {
    public static void main(String[] args) {
        // Char = single character in single quotes
        char myChar = 'D'; // 2 bytes or 16 bits of memory
        // Unicode format
        char myUnicodeChar = '\u0044';
        // Both print the same value
        System.out.println(myChar);
        System.out.println(myUnicodeChar);

        boolean trueBool = true;
        boolean falseBool = false;
        // Often see is before boolean variable to describe condition
        boolean isLockDownOver = false;

        // String is actually considered a class in Java
        String myStr = "This is a string";
        // Double quotes vs single and many letters vs one as in char
        System.out.println(myStr);
        // Can add to string and both versions are printed to the system
        myStr = myStr + " and this is another string!";
        System.out.println(myStr);
    }
}
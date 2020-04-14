
public class OpChallenge {
    public static void main(String[] args) {
        double num = 20.00d;
        double num2 = 80.00d;
        // Must specify num type even when adding two previously defined ones together
        double total = (num + num2) * 100.00d;
        double remainder = total % 40.00d;
        System.out.println("Total: " + total);
        System.out.println("Reaminder: " + remainder);

        boolean isZero = (remainder == 0) ? true : false;
        
        if (!isZero) {
            System.out.println("Got some remainder");
        } else {
            System.out.println("No remainder left");
        }
    }
}
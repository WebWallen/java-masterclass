
public class speed {
    public static void main(String[] args) {
        long miles = mph(10.5);
        printConversion(10.5);
    }

    public static long mph(double kmph) {
        if (kmph < 0) return -1;
        long mph = Math.round(kmph / 1.609);
        return mph;
    }

    public static void printConversion(double kmph) {
        if (kmph < 0) System.out.println("Invalid value");
        long miles = mph(kmph);
        System.out.println(kmph + " km/h = " + miles + " mi/h");
    }
}
public class SMChallenge {
    public static void main(String[] args) {
        String test1 = getDurationString(125, 1);
        String test2 = getDurationString(3945);

        System.out.println(test1);
        System.out.println(test2);
    }

    public static String getDurationString(int min, int sec) {
        if (min <= 0) return "Invalid value";
        if (sec <= 0 || sec >= 59) return "Invalid value";
        int hours = min / 60;
        int minutes = min % 60;
        return hours + "h " + minutes + "m " + sec + "s";
    }

    public static String getDurationString(int sec) {
        if (sec <= 0) return "Invalid value";
        int minutes = sec / 60;
        int seconds = sec % 60;
        // Must return versus assigning to variable in this case
        return getDurationString(minutes, seconds);
    }
}
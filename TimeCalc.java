public class TimeCalc {
    private static final int MINUTES_IN_HOUR = 60;
    private static final int HOURS_IN_DAY = 24;

    public static void main(String[] args) {
        String timeStr = args[0];
        int minutesToAdd = Integer.parseInt(args[1]);

        int initialHours = Integer.parseInt(timeStr.substring(0, 2));
        int initialMinutes = Integer.parseInt(timeStr.substring(3, 5));

        int totalMinutes = (initialHours * MINUTES_IN_HOUR) + initialMinutes + minutesToAdd;
        int totalHoursPassed = totalMinutes / MINUTES_IN_HOUR;
        int newMinutes = totalMinutes % MINUTES_IN_HOUR;
        int newHours = totalHoursPassed % HOURS_IN_DAY;
        System.out.println(String.format("%02d:%02d", newHours, newMinutes));
    }
}
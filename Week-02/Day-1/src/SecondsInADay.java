public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int secondsInDay = 60*60*24;
        int passedSeconds = currentSeconds+ currentMinutes*60+ currentHours*60*60;
        int remainingSeconds = secondsInDay - passedSeconds;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables
        System.out.println("The remaining seconds are:  " + remainingSeconds);

    }
}

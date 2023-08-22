package project_01;

public class Task4 {
    public static void main(String[] args) {
        double min = 3456789;
        double minutesInYear = 60 * 24 * 365;
        double year = (min / minutesInYear);
        double days = (min / 60 / 24) % 365;
        System.out.println(min + " minutes is approximately " + year + " years and " + days + " days");
    }
}

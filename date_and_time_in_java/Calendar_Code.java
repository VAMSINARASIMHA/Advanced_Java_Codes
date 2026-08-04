package date_and_time_in_java;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Calendar_Code {
    public static void main(String[] args) {
        int year = 2026;
        System.out.println("\n\t\t\t" + year + " CALENDAR\n");
        for (Month month : Month.values()) {
            LocalDate firstDay = LocalDate.of(year, month, 1);

            System.out.println("========================================");
            System.out.printf("\t\t%s %d\n", month, year);
            System.out.println("========================================");

            System.out.println("Mon Tue Wed Thu Fri Sat Sun");

            // Day on which the month starts
            DayOfWeek day = firstDay.getDayOfWeek();
            int startDay = day.getValue(); // Monday = 1, Sunday = 7

            // Print leading spaces
            for (int i = 1; i < startDay; i++) {
                System.out.print("    ");
            }

            // Number of days in the month
            int totalDays = firstDay.lengthOfMonth();

            // Print all dates
            for (int date = 1; date <= totalDays; date++) {

                System.out.printf("%3d ", date);

                // Move to next line after Sunday
                if ((date + startDay - 1) % 7 == 0) {
                    System.out.println();
                }
            }

            System.out.println("\n");
        }
    }
}

/*
 * import java.time.DayOfWeek;
 * import java.time.LocalDate;
 * 
 * public class vvv {
 * public static void main(String[] args) {
 * 
 * int year = 2026;
 * int month = 8;
 * 
 * // First day of the month
 * LocalDate firstDay = LocalDate.of(year, month, 1);
 * 
 * // Total days in the month
 * int totalDays = firstDay.lengthOfMonth();
 * 
 * // Day of the week of the 1st day
 * DayOfWeek day = firstDay.getDayOfWeek();
 * 
 * System.out.println(" AUGUST 2026");
 * System.out.println("Mon Tue Wed Thu Fri Sat Sun");
 * 
 * // Print spaces before the first day
 * int value = day.getValue(); // Monday = 1 ... Sunday = 7
 * 
 * for (int i = 1; i < value; i++) {
 * System.out.print(" ");
 * }
 * 
 * // Print all days
 * for (int date = 1; date <= totalDays; date++) {
 * System.out.printf("%3d ", date);
 * 
 * if ((date + value - 1) % 7 == 0) {
 * System.out.println();
 * }
 * }
 * }
 * }
 * 
 */

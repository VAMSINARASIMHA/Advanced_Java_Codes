// This is an example of the new "java.time" package introduced in Java 8 

/*
Main Classes in java.time :- 

1. LocalDate :- Represents a date (year, month, day) without time and timezone.
2. LocalTime :- Represents a time (hour, minute, second, nanosecond)
3. LocalDateTime :- Represents a date and time without timezone.
4. ZonedDateTime :- Represents a date and time with timezone.
5. Instant :- Represents a point in time (timestamp) in UTC.
6. Duration :- Represents a duration of time (hours, minutes, seconds, nanoseconds).
7. Period :- Represents a period of time (years, months, days).
8. DateTimeFormatter :- Used to format and parse date and time objects.
9. ZoneId :- Represents a timezone identifier. (or) Used to specify time zones (e.g., "Asia/Kolkata").
10 ChronoUnit :- Represents a unit of time (e.g., days, hours, minutes). (Or) Used to calculate differences (days, months, years, hours, etc.).
11. DayOfWeek :- Represents the days of the week (e.g., MONDAY, TUESDAY, etc.).
12. Month :- Represents the months of the year (e.g., JANUARY, FEBRUARY, etc.).

*/

package date_and_time_in_java;

import java.time.*;

public class Java_Time_Package {
    public static void main(String[] args) {
        // 1) LocalDate Example :- Represents only the date.
        LocalDate today = LocalDate.now();
        System.out.println("Current Date Is : " + today);

        System.out.println();

        LocalDate obj = LocalDate.now();
        System.out.println("Current Day Of Month Is : " + obj.getDayOfMonth());
        System.out.println("Current Month Is : " + obj.getMonthValue());
        System.out.println("Current Year Is : " + obj.getYear());
        System.out
                .println("Today's Date Is : " + obj.getDayOfMonth() + "/" + obj.getMonthValue() + "/" + obj.getYear());

        System.out.println();

        LocalDate obj1 = LocalDate.of(2026, 8, 9);
        System.out.println("My Birthday Is On : " + obj1);

        System.out.println();
        System.out.println();

        // Operations on LocalDate :-
        LocalDate obj2 = LocalDate.now();
        System.out.println(obj2.plusDays(6));
        System.out.println(obj2.plusMonths(6));
        System.out.println(obj2.plusYears(6));
        System.out.println(obj2.minusDays(6));

        System.out.println(obj.getDayOfWeek());
        System.out.println(obj.getMonth());

        /*
         * 
         * 
         * import java.time.DayOfWeek;
         * import java.time.LocalDate;
         * 
         * public class vvv {
         * public static void main(String[] args) {
         * 
         * LocalDate date = LocalDate.of(2026, 8, 10);
         * 
         * DayOfWeek day = date.getDayOfWeek();
         * 
         * System.out.println("Date : " + date);
         * System.out.println("Day : " + day);
         * }
         * }
         * 
         */

        /*
         * 
         * package date_and_time_in_java;
         * 
         * import java.time.LocalDate;
         * import java.time.Month;
         * 
         * public class Month_Methods {
         * public static void main(String[] args) {
         * 
         * LocalDate today = LocalDate.now();
         * 
         * Month month = today.getMonth();
         * 
         * System.out.println(month); // AUGUST
         * System.out.println(month.getValue()); // 8
         * System.out.println(month.length(false)); // 31
         * }
         * }
         * 
         */

    }
}

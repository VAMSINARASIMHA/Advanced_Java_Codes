package date_and_time_in_java;

import java.time.*;

public class LocalDateTime_Example {
    public static void main(String[] args) {
        LocalDateTime LDT = LocalDateTime.now();
        System.out.println("Current Date and Time: " + LDT);

        System.out.println();

        LocalDateTime obj1 = LocalDateTime.of(2026, 2, 26, 10, 30, 30);
        System.out.println("My Date and Time Is : " + obj1);

        System.out.println();

        // Operations on LocalDateTime :-
        LocalDateTime obj2 = LocalDateTime.now();
        System.out.println(obj2.plusDays(5));
        System.out.println(obj2.plusHours(6));
        System.out.println(obj2.plusMinutes(6));
        System.out.println(obj2.minusDays(5));

    }
}

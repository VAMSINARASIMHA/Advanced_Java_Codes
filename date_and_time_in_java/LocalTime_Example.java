package date_and_time_in_java;

import java.time.*;

public class LocalTime_Example {
    public static void main(String[] args) {
        // 2) LocalTime Example :- Represents a time (hour, minute, second, nanosecond).
        LocalTime obj = LocalTime.now();
        System.out.println("Current Time: " + obj);

        System.out.println();

        LocalTime LT = LocalTime.now();
        System.out.println("Current Hour Is : " + LT.getHour());
        System.out.println("Current Minute Is : " + LT.getMinute());
        System.out.println("Current Second Is : " + LT.getSecond());
        System.out.println("Current Nano Second Is : " + LT.getNano());
        System.out.println("Current Time Is : " + LT.getHour() + ":" + LT.getMinute() + ":" + LT.getSecond() + ":"
                + LT.getNano());

        System.out.println();
        System.out.println();
        System.out.println();

        LocalTime obj1 = LocalTime.of(10, 30, 45);
        System.out.println("My Time Is : " + obj1);

        System.out.println();
        System.out.println();

        // Operations on LocalTime :-
        LocalTime obj2 = LocalTime.now();
        System.out.println(obj2.plusHours(6));
        System.out.println(obj2.plusMinutes(6));
        System.out.println(obj2.plusSeconds(6));
        System.out.println(obj2.minusHours(6));
    }
}

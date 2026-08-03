package date_and_time_in_java;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatter_Example {

    public static void main(String[] args) {

        LocalDateTime Ld = LocalDateTime.now();
        System.out.println("Before formatting: " + Ld);

        System.out.println();

        DateTimeFormatter Dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss a");
        System.out.println("After formatting: " + Ld.format(Dtf));

        System.out.println();

        /*
         * 
         * HH → 24-hour clock → Do NOT use "a"
         * hh → 12-hour clock → Use "a" (AM/PM)
         * 
         */

        LocalDateTime date = LocalDateTime.parse("09/08/2026 01:43:52 AM", Dtf); // A custom DateTimeFormatter.
        System.out.println("My Date Of Birth: " + date.format(Dtf));

        System.out.println();

        DateTimeFormatter Dtfo = DateTimeFormatter.ofPattern("dd EEEE, MMMM yyyy, hh:mm:ss a");
        System.out.println("After formatting: " + Ld.format(Dtfo));

    }
}

package date_and_time_in_java;

// Period :- Represents a period of time (years, months, days).
import java.time.LocalDate;
import java.time.Period;

public class ZoneDateTime_And_Period_And_Instant {

    public static void main(String[] args) {

        LocalDate birth = LocalDate.of(2004, 8, 9);

        LocalDate today = LocalDate.now();

        Period age = Period.between(birth, today);

        System.out
                .println(age.getYears() + " Years" + " : " + age.getMonths() + " Months" + ": " + age.getDays()
                        + " Days");
    }
}

/*
 * 
 * //ZonedDateTime :- Represents a date and time with timezone.
 * 
 * import java.time.ZoneId;
 * import java.time.ZonedDateTime;
 * public class ZoneDateTime_And_Period_And_Instant {
 * public static void main(String[] args) {
 * // 1) ZonedDateTime Example :- Represents a date and time with timezone.(IST
 * :- Indian Standard Time).
 * ZonedDateTime kakinadaTime_or_Hyd =
 * ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
 * System.out.println(kakinadaTime_or_Hyd);
 * }
 * }
 */

// Instant :- Represents a point in time (timestamp) in UTC.

// import java.time.Instant;
// public class vvv {
// public static void main(String[] args) {
// Instant instant = Instant.now();
// System.out.println(instant);
// }
// }

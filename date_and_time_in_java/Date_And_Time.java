package date_and_time_in_java;
// Defination :- The old API (java.util.Date and java.util.Calendar) was Deprecated in java. and The new "java.time" package was introduced in "Java8",and this """(new "java.time" package)""" was introduced to replace the old Date and Calendar classes. 

/*
The old API (java.util.Date and java.util.Calendar) had several problems :- 
Mutable (can be changed)
Not thread-safe
Confusing methods
Difficult to work with time zones

So, This """(new "java.time" package)""" solves these problems.

*/

// This is the example of old API (java.util.Date and java.util.Calendar) :-
import java.util.Date;

public class Date_And_Time {
    public static void main(String[] ar) {
        // java.util.Date obj = new java.util.Date();
        Date obj = new Date();
        System.out.println(obj);

        System.out.println(obj.getTime());

        java.sql.Date obj1 = new java.sql.Date(obj.getTime());
        System.out.println(obj1);
    }
}

// A Regular Expression (Regex) is a pattern used to search, match, validate, or replace text in Java.
// Regex is mainly provided through :- """ import java.util.regex.*; """
// Regex is an API to define a pattern for searching or manipulating strings.

/*
The two important classes are :- 
1) Pattern → represents the regex pattern
2) Matcher → performs matching/searching on text
                    
                        (or)

1) Pattern Class - Defines a pattern (to be used in a search).
2) Matcher Class - Used to search for the pattern.
*/

import java.util.regex.*;

public class Regular_Expression {
    public static void main(String[] args) {
        String stri = ".,_@";
        Pattern ptrn = Pattern.compile("[a-zA-Z0-9.,@$_]+");
        Matcher matr = ptrn.matcher(stri);
        System.out.println(matr.matches()); // true

        String stri3 = "vamsi_09@gmail.com";
        Pattern ptrn3 = Pattern.compile("[a-zA-Z0-9@.$_]+");
        Matcher matr3 = ptrn3.matcher(stri3);
        System.out.println(matr3.matches()); // true

        // Regex Quantifiers.
        System.out.println("vamsinarsimha09@gmail.com".matches("[a-z0-9@.,$_]{22}")); // false
        System.out.println("vamsinarsimha09@gmail.com".matches("[a-z0-9@.,$_]{25}")); // true
        System.out.println("vamsinarsimha09@gmail.com".matches("[a-z0-9@.,$_]{30}")); // false

        System.out.println("vamsinarsimha09@gmail.com".matches("[a-z0-9@.,$_]{20,30}")); // true

        System.out.println("vamsinarsimha09@gmail.com".matches("[a-z0-9@.,$_]{45,}")); // false
        System.out.println("vamsinarsimha09@gmail.com".matches("[a-z0-9@.,$_]{25,}")); // true
        System.out.println("vamsinarsimha09@gmail.com".matches("[a-z0-9@.,$_]{20,}")); // true

        System.out.println();
        System.out.println();
        System.out.println();

        /*
         * 
         * import java.util.regex.Matcher;
         * import java.util.regex.Pattern;
         * 
         * public class vvv {
         * public static void main(String[] args) {
         * Pattern pattern = Pattern.compile("How are you", Pattern.CASE_INSENSITIVE);
         * // Input
         * Matcher matcher = pattern.matcher("hai vamsi how are you?"); // verifying or
         * checking the input.
         * boolean matchFound = matcher.find();
         * if (matchFound) {
         * System.out.println("Match found");
         * } else {
         * System.out.println("Match not found");
         * }
         * }
         * }
         * 
         */

        String str = "09082004";
        Pattern ptr = Pattern.compile("[0-9]+");
        Matcher mr = ptr.matcher(str);
        System.out.println(mr.matches());

        String str1 = "09-08-2004";
        Pattern ptr1 = Pattern.compile("[0-9-]+");
        Matcher mr1 = ptr1.matcher(str1);
        System.out.println(mr1.matches());

        String str2 = "09/08/2004";
        Pattern ptr2 = Pattern.compile("[0-9/]+");
        Matcher mr2 = ptr2.matcher(str2);
        System.out.println(mr2.matches());
        // + :— One or more occurrences
        // + means the preceding character must appear at least once.

        String str3 = "Hai hello Vamsi";
        Pattern ptr3 = Pattern.compile("[a-zA-Z\s]+"); // Here "\s" for the whitespace character.
        Matcher mr3 = ptr3.matcher(str3);
        System.out.println(mr3.matches());

        String str4 = "vamsi09@gmail.com";
        Pattern ptr4 = Pattern.compile("[a-z0-9@.]+");
        Matcher mr4 = ptr4.matcher(str4);
        System.out.println(mr4.matches());

        String str5 = "vamsi09@gmail.com";
        Pattern ptr5 = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
        Matcher mr5 = ptr5.matcher(str5);
        System.out.println(mr5.matches()); // perfect example for the email verification.

        System.out.println();

        System.out.println(" ".matches(" a*"));
        System.out.println("aaaaaaaaa".matches("a*"));
        // * means the preceding character can appear zero times, once, or many times.

        System.out.println();

        System.out.println("color".matches("colou?r"));
        System.out.println("colour".matches("colou?r"));
        // ? — Zero or one occurrence
        // Here, u? means the character u is optional. It can appear zero times or one
        // time.

        System.out.println();

        System.out.println("hello".matches("[a-z]+"));
        System.out.println("a".matches("[abc]"));
        System.out.println("b".matches("[abc]"));
        System.out.println("x".matches("[abc]"));
        System.out.println("Hello".matches("^Hello$")); // Here ^ is Beginning of string. And $ is End of string.

        System.out.println();

        System.out.println("java".matches("java|python"));
        System.out.println("python".matches("java|python"));
        System.out.println("c".matches("java|python"));
        // | Find a match for any one of the patterns separated by | as in: java|python.

        /*
         * 
         * public class Main {
         * public static void main(String[] args) {
         * 
         * String username = "Vamsi123";
         * 
         * if (username.matches("[A-Za-z0-9]{5,15}")) {
         * System.out.println("Valid username");
         * } else {
         * System.out.println("Invalid username");
         * }
         * }
         * }
         * 
         * 
         */

        System.out.println();

        /*
         * 
         * public class Main{
         * public static void main(String[] args) {
         * String text = "Java 123 Python 456";
         * 
         * Pattern pattern = Pattern.compile("\\d+");
         * 
         * Matcher matcher = pattern.matcher(text);
         * 
         * while (matcher.find()) {
         * System.out.println(matcher.group());
         * }
         * }
         * }
         * 
         * 
         * 
         * 
         * 
         * 
         * public class Main {
         * public static void main(String[] args) {
         * System.out.println("a".matches("\\w"));
         * System.out.println("7".matches("\\w"));
         * System.out.println("_".matches("\\w"));
         * System.out.println("@".matches("\\w"));
         * }
         * }
         * 
         */

        // """\b""" ----> Find a match at the beginning of a word like this: \bWORD, or
        // at the end of a word like this: WORD\b

    }
}

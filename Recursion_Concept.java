// Recursion is the technique of making a function call itself. This technique provides a way to break complicated problems down into simpler problems which are easier to solve.

// Recursion is one of the most important concepts in Java. It is used in problems involving mathematics, arrays, strings, trees, graphs, backtracking, and dynamic programming.

// In Simple Words :- Recursion is a programming technique in which a method calls itself to solve a problem.
// Instead of solving the entire problem at once, a recursive method breaks it into smaller versions of the same problem until it reaches a condition where it can stop.

// Sum of the Numbers Code like :- 5+4+3+2+1="15"
import java.util.Scanner;

public class Recursion_Concept {
    public static int sum(int n) {
        if (n > 0) {
            return n + sum(n - 1);
        } else {
            return 0;
        }
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :- ");
        int n = sc.nextInt();
        System.out.print("The Sum Of The Entered Number Is :- ");

        int res = sum(n);
        System.out.println(res);
    }
}

/*
 * 
 * // Factorial Using Recursion :-
 * 
 * import java.util.Scanner;
 * 
 * public class Recursion_Concept {
 * public static int fact(int n) {
 * if (n == 0) {
 * return 1;
 * }
 * return n * fact(n - 1);
 * }
 * 
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.print("Enter a Number :- ");
 * int n = sc.nextInt();
 * System.out.print("The Factorial Of The Entered Number Is :- ");
 * int res = fact(n);
 * System.out.println(res);
 * }
 * }
 */

// Countdown The Numbers Using Recursion :-
/*
 * public class Recursion_Concept {
 * static void countdown(int n) throws InterruptedException {
 * if (n > 0) {
 * System.out.print(n + " ");
 * Thread.sleep(1000);
 * countdown(n - 1);
 * }
 * }
 * 
 * public static void main(String[] args) throws InterruptedException {
 * countdown(5);
 * }
 * }
 * 
 */

/*
 * 
 * // Fibonacci series sum code :-
 * 
 * import java.util.Scanner;
 * 
 * public class Recursion_Concept {
 * 
 * public static int fibonacci(int n) {
 * if (n == 0) {
 * return 0;
 * }
 * if (n == 1) {
 * return 1;
 * }
 * return fibonacci(n - 1) + fibonacci(n - 2);
 * }
 * 
 * @SuppressWarnings("resource")
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.print("Enter a Number :- ");
 * int n = sc.nextInt();
 * System.out.print("The Sum of The Entered fibonacci Number Is :- ");
 * int res = fibonacci(n);
 * System.out.println(res);
 * }
 * }
 * 
 */

// public class Recursion_Concept {
// static void countDown(int n) {
// if (n == 0) {
// return;
// }

// System.out.println(n);
// countDown(n - 1);
// }

// public static void main(String[] args) {
// countDown(5); // o/p :- 5 4 3 2 1.
// }
// }

/*
 * public class Recursion_Concept {
 * 
 * static void fun(int n) {
 * if (n == 0) {
 * return;
 * }
 * 
 * System.out.println(n);
 * fun(n - 1);
 * System.out.println("Returning: " + n);
 * }
 * 
 * public static void main(String[] args) {
 * fun(3);
 * }
 * }
 * 
 * 
 * 
 * o/p :-
 * 3
 * 2
 * 1
 * Returning: 1
 * Returning: 2
 * Returning: 3
 * 
 * 
 */

// public class Recursion_Concept {
// static void print(int n) {
// if (n == 0) {
// return;
// }

// print(n - 1);
// System.out.println(n);
// }

// public static void main(String[] args) {
// print(5); // o/p :- 1 2 3 4 5.
// }
// }
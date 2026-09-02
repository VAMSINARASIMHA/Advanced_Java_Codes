// Command Line Arguments In Java.

public class Command_Line_Arguments {
    public static void main(String[] ar) {

        // 1)
        // System.out.println(ar[2]); // (javac vvv.java) And (java vvv Hai Hello bye).

        // 2)
        // System.out.println(ar[0]); // (javac vvv.java) And (java vvv Hai Hello Bye).
        // System.out.println(ar[1]);
        // System.out.println(ar[2]);

        // 3)
        // System.out.println(ar.length); // (javac vvv.java)And(java vvv Hai Hello
        // Bye).

        /*
         * // 4) Printing All Arguments.
         * 
         * for (int i = 0; i < ar.length; i++) { // (javac vvv.java) And (java vvv Hai
         * Hello vamsi hhh kkkk llll mmm nnnn oooo ppp ...etc).
         * System.out.println(ar[i]);
         * }
         * 
         * 
         * // Note :- Here java vvv Hai Hello vamsi 9999 0000 777
         * // it this above Note 9999 0000 777 are not int, they are Strings.
         */

        // 5)
        // Example: Adding Two Strings.
        // System.out.println(ar[0] + ar[1]); // (javac vvv.java) And (java vvv 23 45).

        // 6)
        // Example: Adding Two Numbers.
        int a = Integer.parseInt(ar[0]);
        int b = Integer.parseInt(ar[1]);
        System.out.println(a + b); // (javac vvv.java) And (java vvv 2 3).

    }
}

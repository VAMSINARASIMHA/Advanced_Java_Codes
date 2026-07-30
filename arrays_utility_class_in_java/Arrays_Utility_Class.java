/*
The Arrays Utility Class in Java is a final utility class present in the java.util package. It contains many static methods for performing common operations on arrays such as:

Sorting
Searching
Filling
Comparing
Copying
Converting to String
Parallel operations (Java 8+)

Since all methods are static, you don't create an object of the Arrays class.

*/
package arrays_utility_class_in_java;

import java.util.Arrays;

public class Arrays_Utility_Class {
    public static void main(String[] args) {
        // 1. Arrays.toString() :- Converts an array into a readable String.
        int[] numbers = { 10, 20, 30, 40 };
        System.out.println(Arrays.toString(numbers));
    }
}
/*
 * 
 * 2. Arrays.sort() :- Sorts an array in ascending order.
 * ---> Arrays.sort() sorts an array using a single thread.
 * ---> Only one CPU core is used for sorting.
 *
 * Code :-
 * 
 * import java.util.Arrays;
 * public class Main {
 * public static void main(String[] args) {
 * int[] arr = {50, 10, 70, 20, 40};
 * Arrays.sort(arr);
 * System.out.println(Arrays.toString(arr)); // [10, 20, 40, 50, 70].
 * }
 * }
 * 
 */

/*
 * 3. Arrays.binarySearch() :- Searches an element using Binary Search.
 * Important Note : The array must already be sorted.
 * 
 * Code :-
 * 
 * import java.util.Arrays;
 * public class Main {
 * public static void main(String[] args) {
 * int[] arr = {10, 20, 30, 40, 50};
 * int index = Arrays.binarySearch(arr, 40);
 * System.out.println(index); // 3.
 * }
 * }
 * 
 */

/*
 * 4. Arrays.fill() :- Fills every element with the same value.
 * 
 * Code :-
 * 
 * import java.util.Arrays;
 * public class Main {
 * public static void main(String[] args) {
 * int[] arr = new int[5];
 * Arrays.fill(arr, 100);
 * System.out.println(Arrays.toString(arr)); // [100, 100, 100, 100, 100].
 * 
 * // Fill a specific range:-
 * 
 * int[] arr1 = {10,20,30,40,50};
 * Arrays.fill(arr1, 1, 4, 99);
 * System.out.println(Arrays.toString(arr1)); // [10, 99, 99, 99, 50].
 * }
 * }
 * 
 */

/*
 * 5. Arrays.copyOf() :- Copies an array.
 * 
 * Code :-
 * 
 * import java.util.Arrays;
 * public class Main {
 * public static void main(String[] args) {
 * int[] arr = {10,20,30};
 * int[] copy = Arrays.copyOf(arr, arr.length);
 * System.out.println(Arrays.toString(copy)); // [10, 20, 30].
 * 
 * 
 * //Copy with larger size :-
 * 
 * int[] arr1 = {1,2,3};
 * int[] copy1 = Arrays.copyOf(arr1, 5);
 * System.out.println(Arrays.toString(copy1)); // [1, 2, 3, 0, 0].
 * "Remaining positions are filled with default values.('0')".
 * }
 * }
 * 
 */

/*
 * 
 * 6. Arrays.copyOfRange() :- Copies only a portion of an array.
 * 
 * Code :-
 * 
 * import java.util.Arrays;
 * public class Main {
 * public static void main(String[] args) {
 * int[] arr = {10,20,30,40,50};
 * int[] part = Arrays.copyOfRange(arr, 1, 4);
 * System.out.println(Arrays.toString(part)); // [20, 30, 40].
 * }
 * }
 * 
 */

/*
 * 7. Arrays.equals() :- Checks whether two arrays have the same elements in the
 * same order.
 * 
 * Code :-
 * 
 * import java.util.Arrays;
 * public class Main {
 * public static void main(String[] args) {
 * int[] a = {10,20,30};
 * int[] b = {10,20,30};
 * System.out.println(Arrays.equals(a, b)); // true.
 * }
 * }
 * 
 */

/*
 * 8. Arrays.deepEquals() :- Used for comparing multidimensional arrays.
 * 
 * Code :-
 * 
 * import java.util.Arrays;
 * public class Main {
 * public static void main(String[] args) {
 * int[][] a = {
 * {1,2},
 * {3,4}
 * };
 * 
 * int[][] b = {
 * {1,2},
 * {3,4}
 * };
 * 
 * System.out.println(Arrays.deepEquals(a, b)); //true.
 * }
 * }
 * 
 */

/*
 * 9. Arrays.deepToString() :- Prints multidimensional arrays properly.
 * 
 * Code :-
 * 
 * import java.util.Arrays;
 * public class Main {
 * public static void main(String[] args) {
 * int[][] arr = {
 * {1,2},
 * {3,4}
 * };
 * 
 * System.out.println(Arrays.deepToString(arr)); // [[1, 2], [3, 4]].
 * }
 * }
 * 
 */

/*
 * 
 * 10. Arrays.mismatch() (Java 9+) :- Returns the first index where two arrays
 * differ.
 * 
 * Code :-
 * 
 * import java.util.Arrays;
 * public class Main {
 * public static void main(String[] args) {
 * int[] a = {10,20,30,40};
 * int[] b = {10,20,35,40};
 * System.out.println(Arrays.mismatch(a,b)); // 2.
 * }
 * }
 * 
 */

/*
 * 11. Arrays.parallelSort() :- sorts an array using multiple threads.
 * and also Multiple CPU cores can work on different parts of the array at the
 * same time.
 * 
 * Code :-
 * 
 * import java.util.Arrays;
 * public class Main {
 * public static void main(String[] args) {
 * int[] arr = {9,8,5,1,3,2,7,6};
 * Arrays.parallelSort(arr);
 * System.out.println(Arrays.toString(arr)); // [1, 2, 3, 5, 6, 7, 8, 9].
 * }
 * }
 * 
 */

/*
 * 12. "Arrays.parallelPrefix()", 13. "Arrays.setAll()",
 * 14. "Arrays.parallelSetAll()", 15. "Arrays.asList()".
 */
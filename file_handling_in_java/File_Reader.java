// Scanner, BufferedReader, FileInputStream :- Are the Other Ways to Read Files.
// Scanner - best for simple text and when you want to parse numbers or words easily.
// BufferedReader - best for large text files, because it is faster and reads line by line.
// FileInputStream - best for binary data (images, audio, PDFs) or when you need full control of raw bytes. 

package file_handling_in_java;

import java.io.FileReader;

public class File_Reader {
    public static void main(String[] args) {
        try {
            @SuppressWarnings("resource")
            FileReader fr = new FileReader("File_Reader.java");
            int ch = 0;

            // ch = fr.read();
            // System.out.print((char) ch); // Output :- "/".

            // ch = fr.read();
            // System.out.print((char) ch); // Output :- "/".

            // ch = fr.read();
            // System.out.print((char) ch); // Output :- " ".

            while ((ch = fr.read()) != -1) {

                System.out.print((char) ch);
            }

        } catch (Exception e) {
            System.out.println("Something went wrong");
            e.printStackTrace();
        }
    }
}

/*
 * 
 * // Using try-with-Resources :-
 * 
 * 
 * import java.io.FileReader;
 * 
 * public class vvv {
 * public static void main(String[] args) {
 * 
 * try (FileReader fr = new FileReader("f1.txt")) {
 * int ch = 0;
 * while ((ch = fr.read()) != -1) {
 * 
 * System.out.print((char) ch);
 * }
 * } catch (Exception e) {
 * System.out.println("Something went wrong");
 * e.printStackTrace();
 * }
 * }
 * }
 * 
 * 
 */

// Using BufferedReader :-
// BufferedReader lets you read text line by line with readLine().

/*
 * 
 * import java.io.BufferedReader;
 * import java.io.FileReader;
 * 
 * public class vvv {
 * public static void main(String[] args) throws Exception {
 * try {
 * FileReader fr = new FileReader("f1.txt");
 * 
 * @SuppressWarnings("resource")
 * BufferedReader br = new BufferedReader(fr);
 * String ch;
 * while ((ch = br.readLine()) != null) {
 * System.out.println(ch);
 * }
 * 
 * } catch (Exception e) {
 * System.out.println("Something went Wrong");
 * e.printStackTrace();
 * }
 * }
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * // Using try-with-Resources :-
 * 
 * 
 * import java.io.BufferedReader;
 * import java.io.FileReader;
 * 
 * public class vvv {
 * public static void main(String[] args) throws Exception {
 * try (BufferedReader br = new BufferedReader(new FileReader("f1.txt"));) {
 * String ch;
 * while ((ch = br.readLine()) != null) {
 * System.out.println(ch);
 * }
 * 
 * } catch (Exception e) {
 * System.out.println("Something went Wrong");
 * e.printStackTrace();
 * }
 * }
 * }
 */

// Using Scanner :-

/*
 * 
 * import java.io.File;
 * import java.io.FileNotFoundException;
 * import java.util.Scanner;
 * 
 * public class vvv {
 * 
 * @SuppressWarnings("resource")
 * public static void main(String[] args) {
 * File ff = new File("f1.txt");
 * try {
 * Scanner sc = new Scanner(ff);
 * while (sc.hasNextLine()) {
 * System.out.print(sc.nextLine());
 * }
 * } catch (FileNotFoundException e) {
 * System.out.println("Something went wrong");
 * e.printStackTrace();
 * }
 * 
 * }
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * // Using try-with-Resources :-
 * 
 * 
 * 
 * import java.io.File;
 * import java.io.FileNotFoundException;
 * import java.util.Scanner;
 * 
 * public class vvv {
 * public static void main(String[] args) {
 * try (Scanner sc = new Scanner(new File("f1.txt"));) {
 * while (sc.hasNextLine()) {
 * System.out.print(sc.nextLine());
 * }
 * } catch (FileNotFoundException e) {
 * System.out.println("Something went wrong");
 * e.printStackTrace();
 * }
 * 
 * }
 * }
 * 
 */
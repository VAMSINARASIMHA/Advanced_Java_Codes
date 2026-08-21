//Writing to a File :-
// There are several ways to write :- FileWriter, BufferedWriter, PrintWriter, FileOutputStream, Files.write().
// FileWriter - easiest choice for basic text.
package file_handling_in_java;

import java.io.FileWriter;
import java.io.IOException;

//FileWriter is used to write character/text data.

public class File_Writer {
    public static void main(String[] args) {
        try {
            FileWriter obj = new FileWriter("C:\\Users\\vamsi\\OneDrive\\Documents\\Advanced_Java_Codes\\f1.txt");
            obj.write("Hai this is my first java Text file using 'FileWriter'.");
            obj.close();
        } catch (IOException e) {
            System.out.println("Something went wrong");
            e.printStackTrace();
        }
    }
}

/*
 * 
 * // To add the extra text or information into the files.
 * 
 * import java.io.FileWriter;
 * import java.io.IOException;
 * 
 * public class vvv {
 * public static void main(String[] args) {
 * try {
 * FileWriter obj = new FileWriter(
 * "C:\\Users\\vamsi\\OneDrive\\Documents\\Advanced_Java_Codes\\f1.txt", true);
 * obj.
 * write("Hai this is my first txt file in java file Handling. \nHai I am vamsi."
 * );
 * obj.close();
 * } catch (IOException e) {
 * System.out.println("Something went wrong");
 * e.printStackTrace();
 * }
 * 
 * }
 * }
 * 
 */

// Note :- Here we can use try-with-resources for this file handling.

/*
 * 
 * 
 * import java.io.File;
 * import java.io.FileWriter;
 * import java.io.IOException;
 * 
 * //FileWriter is used to write character/text data.
 * 
 * public class vvv {
 * public static void main(String[] args) {
 * String st =
 * "C:\\Users\\vamsi\\OneDrive\\Documents\\Advanced_Java_Codes\\f3.txt";
 * FileWriter obj = null;
 * 
 * try {
 * File ob = new File(st);
 * obj = new FileWriter(ob);
 * obj.write("Hai this is my first java Text file using 'FileWriter'.\n");
 * 
 * obj.write(65);
 * 
 * obj.write("\nOvels\n");
 * 
 * char ch[] = { 'a', 'e', 'i', 'o', 'u' };
 * obj.write(ch);
 * 
 * obj.close();
 * } catch (IOException e) {
 * System.out.println("Something went wrong");
 * e.printStackTrace();
 * }
 * }
 * }
 * 
 * 
 * 
 */
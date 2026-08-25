// The BufferedWriter class is used to write text to a file, one line or one string at a time. If the file already exists, its contents will be replaced (overwritten).
// FileWriter - best for simple text writing. Quick and easy to use.
// BufferedWriter - better for larger text files, because it is faster and lets you easily add line breaks with newLine().
// FileOutputStream - best for binary files (like images, PDFs, or audio).

package file_handling_in_java;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Buffered_Writer {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("f2.txt");
            BufferedWriter br = new BufferedWriter(fw);

            br.write("FileWriter using BufferedWriter in java");

            br.newLine();
            br.newLine();

            br.append("vamsi ");

            br.newLine();
            br.newLine();

            br.write("Ascii value of '65' is : ");
            br.write(65); // "A".

            br.newLine();
            br.newLine();

            br.write("this is a new line code");
            br.close();
        } catch (Exception e) {
            System.out.println("Something went wrong");
            e.printStackTrace();
        }
    }
}

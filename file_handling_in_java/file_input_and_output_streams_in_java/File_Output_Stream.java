// The FileOutputStream class writes data as raw bytes. That means you can use it not only for text files, but also for binary files (like images, PDFs, or audio).
// ****Note: If the file already exists, its contents will be replaced (overwritten).

package file_handling_in_java.file_input_and_output_streams_in_java;

import java.io.IOException;
import java.io.FileOutputStream;

public class File_Output_Stream {
    public static void main(String[] args) throws IOException {
        String Message = "Anime was Amazing.";
        FileOutputStream FOS = new FileOutputStream("Anime.txt");
        FOS.write(Message.getBytes());
        FOS.close();

    }

}

// (OR) Another Way Of Code :-

/*
 * import java.io.*;
 * 
 * public class File_Output_Stream {
 * public static void main(String[] args) throws IOException {
 * 
 * try (FileOutputStream output = new FileOutputStream("Anime.txt")) {
 * 
 * String text = "Hello Java";
 * 
 * byte[] data = text.getBytes();
 * 
 * output.write(data);
 * }
 * }
 * }
 * 
 */

/*
 * 
 * FileInputStream In-Built Methods Are :-
 * available(), close(), read(), skip(), getFD(), getChannel().
 * 
 */

/*
 * 
 * FileOutputStream In-Built Methods Are :-
 * close(), flush(), write(), getFD(), getChannel().
 * 
 */

/*
 * 
 * // By default, FileOutputStream overwrites the file if it already exists. To
 * add (append) new content instead, pass true as the second argument:
 *
 *
 * 
 * import java.io.FileOutputStream;
 * import java.io.IOException;
 * 
 * public class vvv {
 * public static void main(String[] args) {
 * String text = "\nAn Appended text Message! ";
 * 
 * // true = append mode (keeps existing content)
 * try (FileOutputStream output = new FileOutputStream("Example_File.txt",
 * true)) {
 * output.write(text.getBytes());
 * System.out.println("Successfully appended to file.");
 * } catch (IOException e) {
 * System.out.println("Error writing file.");
 * e.printStackTrace();
 * }
 * }
 * }
 * 
 */
// FileInputStream is a way to read bytes from a file.
// In Simple Words :- FileInputStream="Read bytes from a file"
// when reading binary data (like images, audio, or PDFs), or when you need full control of raw bytes. In those cases, you use FileInputStream.

package file_handling_in_java.file_input_and_output_streams_in_java;

import java.io.*;

public class File_Input_Stream {
    public static void main(String[] args) throws IOException {

        FileInputStream input = new FileInputStream("Copying_Files.java");
        int data;

        while ((data = input.read()) != -1) {
            System.out.print((char) data);
        }
        input.close();

    }
}
// This program reads """demon1.jpg""" and writes it into """demon_Salyer1_pic.jpg""".

package file_handling_in_java.file_input_and_output_streams_in_java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copying_Files {
    public static void main(String[] args) {
        try (FileInputStream input = new FileInputStream(
                "C:\\Users\\vamsi\\OneDrive\\Pictures\\Demon slayer pics\\demon1.jpg");
                FileOutputStream output = new FileOutputStream(
                        "C:\\Users\\vamsi\\OneDrive\\Documents\\demon_Salyer1_pic.jpg")) {

            int i;
            while ((i = input.read()) != -1) {
                output.write(i);
            }

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.out.println("Error handling file.");
        }
    }
}

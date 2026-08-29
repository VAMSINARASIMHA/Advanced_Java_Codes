package file_handling_in_java;

// PrintWriter makes formatted text output easily.

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Print_Writer {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw_obj = new PrintWriter("pw.txt");
        pw_obj.println("A Message.");
        pw_obj.println(100);
        pw_obj.println(1.56);
        pw_obj.println(true);
        pw_obj.println('Z');
        pw_obj.println(65);

        pw_obj.write("\n");
        pw_obj.write(66);
        pw_obj.write("\n");
        pw_obj.write("\n");

        pw_obj.printf("Name : %s%n", "ram");
        pw_obj.printf("marks : %d%n", 99);

        pw_obj.close();
    }
}

package file_handling_in_java;

import java.io.File;
import java.io.IOException;

public class File_Permissions {
    public static void main(String[] args) throws IOException {
        File obj = new File("f4.txt");
        if (obj.createNewFile()) {
            System.out.println("File was Created Successfully.");
        } else {
            System.out.println("This File was already Exists.");
        }

        File obj1 = new File("f3.txt");
        obj.renameTo(obj1);

        obj1.setWritable(true); // setWritable() is used to set or remove the write permission of a file.
        obj1.setReadOnly(); // setReadOnly() is used to make a file read-only.
        obj1.setReadable(true); // setReadable() is used to set the read permission of a file.
        obj1.setExecutable(true); // setExecutable() is used to set or remove the execute permission of a file.

        System.out.println("Can Read: " + obj1.canRead());
        System.out.println("Can write: " + obj1.canWrite());
        System.out.println("Can execute: " + obj1.canExecute());
        System.out.println(obj1.length());

    }
}
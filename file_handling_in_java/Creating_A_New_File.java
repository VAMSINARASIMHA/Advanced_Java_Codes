package file_handling_in_java;

import java.io.File;
import java.io.IOException;

public class Creating_A_New_File {
    public static void main(String[] args) {

        // File obj = new File("C:\\Users\\vamsi\\OneDrive\\Documents\\DSA\\File1.txt");
        // Create a File Through a Specific Path.

        File obj = new File("File1.txt"); // Create a File Directly.
        try {
            if (obj.createNewFile()) {
                System.out.println("A New File was Created Successfully " + obj.getName());
            } else {
                System.out.println("This File Was Already Exists.");
            }
        } catch (IOException e) {
            System.out.println("Some Kind of Error Was Occured.");
            e.printStackTrace();
        }
    }
}

/*
 * 
 * // Creating a Folder.
 * import java.io.File;
 * public class Creating_A_New_File {
 * public static void main(String[] args) {
 * 
 * File folder = new File("Notes/Shoyeb"); // "C:/Notes/Shoyeb" creates in 'c'
 * Drive.
 * 
 * if (folder.mkdirs()) {
 * System.out.println("Folders created successfully!");
 * } else {
 * System.out.println("Folders already exist.");
 * }
 * }
 * }
 * 
 */

/*
 * 
 * //To check how many Files (or) Folders are present in the given Path.
 * 
 * import java.io.File;
 * 
 * public class Creating_A_New_File {
 * public static void main(String[] args) {
 * File obj = new
 * File("C:\\Users\\vamsi\\OneDrive\\Documents\\Advanced_Java_Codes");
 * String str[] = obj.list();
 * for (String st : str) {
 * System.out.println(st);
 * }
 * }
 * }
 * 
 */
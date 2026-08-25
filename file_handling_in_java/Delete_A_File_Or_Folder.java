package file_handling_in_java;
// To delete a folder.

import java.io.File;

public class Delete_A_File_Or_Folder {
    public static void main(String[] args) {
        File obj = new File("C:\\Users\\vamsi\\OneDrive\\Documents\\Advanced_Java_Codes\\example_folder");
        if (obj.delete()) {
            System.out.println("file was successfully deleted");
        } else {
            System.out.println("already deleted");
        }
    }
}

// To delete a specific file.

/*
 * 
 * 
 * import java.io.File;
 * 
 * public class vv {
 * public static void main(String[] args) {
 * File obj = new File("vvv.java");
 * if (obj.delete()) {
 * System.out.println("file was successfully deleted");
 * } else {
 * System.out.println("already deleted");
 * }
 * }
 * }
 * 
 */

// Note :- we can't delete a folder when there is any files are present in it.
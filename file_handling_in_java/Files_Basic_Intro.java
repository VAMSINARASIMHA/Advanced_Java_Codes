// The File class from the java.io package, allows us to work with files.
// To use the File class, create an object of the class, and specify the filename or directory name.
// It has some in-built methods like :- canRead(), canWrite(), createNewFile(), delete(), exists(), getName(), getAbsolutePath(), length(), list(), mkdir().

package file_handling_in_java;

import java.io.File;

public class Files_Basic_Intro {
    public static void main(String[] args) {
        File obj = new File("C:\\Users\\vamsi\\OneDrive\\Documents\\DSA\\linearsearch.java"); // It represents a file or
                                                                                              // directory path.
        System.out.println(obj.exists());
        System.out.println(obj.length());
        System.out.println(obj.getName());
        System.out.println(obj.getPath());

    }
}

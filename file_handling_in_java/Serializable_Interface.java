// Serialization means converting an object into a byte stream so it can be stored or transmitted.
// Serialization = "Convert/store a Java object's state as bytes".
/*

Java Object
     ↓
Serialization (ObjectOutputStream)
     ↓
Byte Stream (FileOutputStream)
     ↓
File

*/

package file_handling_in_java;

import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

class employee implements Serializable {
    int id;
    String name;

    public employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "[id=" + id + ", name=" + name + "]";
    }

    public void display() {
        System.out.println("Company Id : " + id);
        System.out.println("Employee Name : " + name);

    }

}

public class Serializable_Interface {
    public static void main(String[] args) throws IOException {
        employee obj = new employee(22, "vamsi");
        obj.display();

        FileOutputStream fos = new FileOutputStream("example.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos); // BufferedOutputStream is good for the better
                                                                  // performance.

        ObjectOutputStream oos = new ObjectOutputStream(bos); // ObjectOutputStream wraps the file stream to handle the
                                                              // conversion of Java objects to bytes.

        oos.writeObject(obj); // The writeObject(obj) method converts our Student object into a stream of
                              // bytes and writes them to the file.

        oos.close();
        bos.close();
        fos.close();
    }
}
// Serializable is a marker interface (it has no methods to implement).
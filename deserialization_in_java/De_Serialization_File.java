// De-Serialization is the reverse processes of Serialization.
// De-Serialization = converting "Bytes" to the """Java object's""". 
/*
File
 ↓
De-Serialization (ObjectInputStream)
 ↓
Byte Stream (FileInputStream)
 ↓
Java Object
*/

package deserialization_in_java;

import java.io.Serializable;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

class BMW implements Serializable {
    int Price;
    String Model;

    public BMW(int Price, String Model) {
        this.Price = Price;
        this.Model = Model;
    }

    public String toString() {
        return "Car Details :- [ Car Model :- " + Model + ", Car Price :- " + Price + " ]";
    }

    public void Display() {
        System.out.println("Car Model :- " + Model);
        System.out.println("Car Price :- " + Price);
    }
}

public class De_Serialization_File {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream("BMW_Car.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);

        ObjectInputStream ois = new ObjectInputStream(bis);
        BMW bmw = (BMW) ois.readObject();
        bmw.Display();

        ois.close();
        bis.close();
        fis.close();
    }
}

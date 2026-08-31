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

        FileInputStream fos = new FileInputStream("BMW_Car.txt");
        BufferedInputStream bos = new BufferedInputStream(fos); // BufferedOutputStream is good for the better
                                                                // performance.

        ObjectInputStream oos = new ObjectInputStream(bos); // ObjectOutputStream wraps the file stream to handle the
                                                            // conversion of Java objects to bytes.
        BMW bmw = (BMW) oos.readObject();
        bmw.Display();

        oos.close();
        bos.close();
        fos.close();
    }
}

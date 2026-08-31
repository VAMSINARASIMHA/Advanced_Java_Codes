package deserialization_in_java;

import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.ObjectOutputStream;
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

public class Serialization_File {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        BMW obj = new BMW(30_00000, "M4");
        obj.Display();

        FileOutputStream FOS = new FileOutputStream("BMW_Car.txt");
        BufferedOutputStream BOS = new BufferedOutputStream(FOS);
        ObjectOutputStream OOS = new ObjectOutputStream(BOS);

        OOS.writeObject(obj);

        OOS.close();
        BOS.close();
        FOS.close();
    }
}
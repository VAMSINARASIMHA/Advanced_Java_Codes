// The transient keyword in Java is mainly used with Serialization.
// When a field is marked as transient, that field will not be serialized when the object is converted into a byte stream.
// In Simple Words :- ( transient = "Don't save this field during serialization." ).
// The transient keyword tells Java's default serialization mechanism to skip a particular instance field when serializing an object.

package transient_in_java;

import java.io.*;

class Selective_Serialization implements Serializable {

    String Bat_s_Man_Name;
    int Score;
    transient String Bat_Name; // Bat_Name will not be serialized. And It is Useful for sensitive or temporary
                               // fields.

    public Selective_Serialization(int Score, String Bat_s_Man_Name, String Bat_Name) {
        this.Score = Score;
        this.Bat_s_Man_Name = Bat_s_Man_Name;
        this.Bat_Name = Bat_Name;
    }

    public String toString() {
        return "Cricket Details :- [ Score :- " + Score + ", Bat's Man Name :- " + Bat_s_Man_Name + "Bat_Name :- "
                + Bat_Name + " ]";
    }

    public void show() {
        System.out.println("Bat's Man Name :- " + Bat_s_Man_Name);
        System.out.println("Score :- " + Score);
        System.out.println("Bat_Name :- " + Bat_Name);
    }
}

public class Transient_Keyword_Using_Serialization {
    public static void main(String[] args) throws IOException {
        Selective_Serialization ss = new Selective_Serialization(96, "Dhoni", "Dhoni Bat");
        ss.show();

        FileOutputStream FOS = new FileOutputStream("Transient_file.txt");
        BufferedOutputStream BOS = new BufferedOutputStream(FOS);
        ObjectOutputStream OOS = new ObjectOutputStream(BOS);
        OOS.writeObject(ss);
        OOS.close();
        BOS.close();
        FOS.close();

    }
}
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

public class Transient_Keyword_Using_De_Serialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream FIS = new FileInputStream("Transient_file.txt");
        BufferedInputStream BIS = new BufferedInputStream(FIS);
        ObjectInputStream OIS = new ObjectInputStream(BIS);
        Selective_Serialization sss = (Selective_Serialization) OIS.readObject();
        sss.show();

        OIS.close();
        BIS.close();
        FIS.close();
    }
}

// DataOutputStream is used to write Java primitive data types into an output stream in binary format.
// DataOutputStream → write primitive data.

// import java.io.DataOutputStream;
// import java.io.FileOutputStream;
// import java.io.DataInputStream;
// import java.io.FileInputStream;
// import java.io.IOException;

package file_handling_in_java;

import java.io.*;

public class Data_Input_And_Output_Streams {
    public static void main(String[] args) throws IOException {

        DataOutputStream obj = new DataOutputStream(new FileOutputStream("example2.txt"));

        obj.writeInt(32);
        obj.writeDouble(33.33);
        obj.writeBoolean(true);

        // obj.writeUTF("Hello, world!");

        obj.close();

        // DataInputStream in Java is used to read primitive data types (int, float,
        // double, boolean, char, etc.) from an input stream in a machine-independent
        // binary format.

        // DataInputStream → read primitive data.

        // One important point :- DataInputStream is not serialization. It is simply a
        // convenient way to read/write primitive values in a binary format.

        DataInputStream obj1 = new DataInputStream(new FileInputStream("example2.txt"));
        int a = obj1.readInt();
        double b = obj1.readDouble();
        boolean c = obj1.readBoolean();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // String str = obj1.readUTF();
        // System.out.println(str);

        obj1.close();
    }

}

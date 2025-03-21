package serialization;

import java.io.*;
import java.sql.SQLOutput;


public class Serail  {
    public static void main(String[] args)  {

        Student students = new Student("Vighnesh", 10, 1, 100, "Bhandary", "Malad");
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("childs.txt"));

            oos.writeObject(students);

            oos.close();
            System.out.println("transferred to childs.txt");
        }
        catch(IOException ex){
            System.out.println(ex);
        }

    }
}

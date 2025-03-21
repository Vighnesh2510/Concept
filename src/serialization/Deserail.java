package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserail {
    public static void main(String[] args) {
        try{

            FileInputStream fis = new FileInputStream("childs.txt");
            ObjectInputStream obs = new ObjectInputStream(fis);

            Student students=(Student)obs.readObject();
            students.Show();
            System.out.println(students.getLocation());
            students.display();

        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}

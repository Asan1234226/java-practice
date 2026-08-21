import java.io.File;
import java.io.FileWriter;

public class test10 {
    public static void main(String[] args) throws  Exception {
        FileWriter writer = new FileWriter("data.txt");

        for (int i = 0; i <= 100; i++) {
               writer.write(i +"\n");
            }
            writer.close();
        }
    }


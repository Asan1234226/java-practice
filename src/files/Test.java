package files;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Test {
    public static void main(String[] args) throws Exception {
        Path path = Path.of("prices.txt");
        List<String> lines = Files.readAllLines(path);
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        for (int i = 0; i <lines.size() ; i++) {
            if (lines.get(i).equals("A")) {
                a++;
            } else if (lines.get(i).equals("B")) {
                b++;
            } else if (lines.get(i).equals("C")) {
                c++;
            } else if (lines.get(i).equals("D")) {
                d++;

            }
        }
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("C: " + c);
        System.out.println("D: " + d);
    }
}


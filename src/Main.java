import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String in1;
        String in2;

        FileReader f1 = new FileReader("C:\\\\Users\\\\Вероника\\\\IdeaProjects\\\\file_comparison\\\\src\\\\one.txt");
        FileReader f2 = new FileReader("C:\\\\Users\\\\Вероника\\\\IdeaProjects\\\\file_comparison\\\\src\\\\two.txt");
        Scanner scan = new Scanner(f1);

        try (f2) {
            int c1;
            int c2;
            while (((c1 = f1.read()) != -1) && (c2 = f2.read()) != -1) {
                if (c1 != c2) {
                    System.out.print((char) c1);
                    System.out.print(" и ");
                    System.out.print((char) c2);
                    System.out.print(" не совпадают");
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

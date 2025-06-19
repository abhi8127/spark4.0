import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedDemo {
    public static void main(String[] args) {
        FileInputStream fis;
        try{
            //FileReader file =new FileReader("abhi.txt");
            fis=new FileInputStream("abhi.txt");
        } catch (IOException e) {
            System.out.println("Error reading file");
            System.exit(0);
        }
        finally {
            System.out.println("in finally");
        }
    }
}

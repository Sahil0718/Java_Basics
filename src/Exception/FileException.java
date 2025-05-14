package Exception;
//Write a Java program  that reads a file and throws an exception if the file is empty

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileException {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/abc.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found!");
        } finally {
            if (fis != null) {
                fis.close();
                System.out.println("File Found!");
            } else {
                System.out.println("No file to be closed!");
            }
        }
    }
}

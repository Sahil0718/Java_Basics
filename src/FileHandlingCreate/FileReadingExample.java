package FileHandlingCreate;

import java.io.FileReader;
import java.io.IOException;

public class FileReadingExample {
    public static void main(String[] args) throws IOException {
        String fileName = "src\\FileHandlingCreate\\file.txt";
        try (FileReader reader = new FileReader(fileName))//try with resources
        {
            int read = 0;
            do {
                read = reader.read();
                System.out.println((char) read);
            } while (read != -1);
        } catch (IOException E) {
            System.out.printf("Exception Occurred: %s", E.getMessage());
        }
    }
}

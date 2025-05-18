package FileHandlingCreate;
//Common Methods
//write(int c): Writes a single character

import java.io.FileWriter;
import java.io.IOException;

public class FileHandling_Writer {
    public static void main(String[] args) {
        String fileName = "src\\FileHandlingCreate\\file.txt";
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("This is the best example for writing a file!");
            writer.flush();
            System.out.println("All the data were written successfully!");
            writer.close();
        } catch (IOException e) {
            System.out.printf("Exception offer %s\n", e.getMessage());
        }
    }
}

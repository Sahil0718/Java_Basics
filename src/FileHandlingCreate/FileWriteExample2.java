package FileHandlingCreate;

import java.io.IOException;
import java.io.FileWriter;

public class FileWriteExample2 {
    public static void main(String[] args) throws IOException {
        String fileName = "src\\FileHandlingCreate\\example2.txt";
        try (FileWriter writer = new FileWriter(fileName)) { //try with resources
            writer.write("Hello guys! This is the second example");
            for (int i = 0; i < 5; i++) {
                writer.write("*");
            }
            writer.flush();
            System.out.println("The content was written successfully!");
        } catch (IOException e) {
            System.out.println("Exception offer %s\n" + e.getMessage());
        }
    }
}

package File_Reader;

import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class CreateFilePointing_Writer {
    public static void main(String[] args) {
        try {
            String desktop_path = System.getProperty("user.home") + "/Desktop";
            File file = new File(desktop_path + "/FilePointing.txt");
            FileWriter writer = new FileWriter(file);
            writer.write("Good Morning! Boss");
            writer.close();
            System.out.println("Successfully wrote inside the file!");
        } catch (IOException e) {
            System.out.println("Error Occurred!");
            e.printStackTrace(); //This will actually print the stack tree
        }
    }
}

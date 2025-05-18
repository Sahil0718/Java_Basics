package File_Reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFileWithBuffer {
    public static void main(String[] args) {
        String desktop_path = System.getProperty("user.home") + "/Desktop";
        String filePath = desktop_path + "/FilePointing.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file!");
            e.printStackTrace();
        }
    }
}

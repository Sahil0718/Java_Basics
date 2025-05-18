package File_Reader;

import java.io.File;
import java.io.IOException;

public class CreatingFile {
    public static void main(String[] args) {
        try {
            File my_obj = new File("src/File_Reader/First_created_file.txt");
            if (my_obj.createNewFile()) {
                System.out.println("File Created " + my_obj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred! " + e.getMessage());
            e.printStackTrace();
        }
    }
}

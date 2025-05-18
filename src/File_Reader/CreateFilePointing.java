package File_Reader;

import java.io.File;
import java.io.IOException;

public class CreateFilePointing {
    public static void main(String[] args) {
        try {
            String desktop_path = System.getProperty("user.home") + "/Desktop";
            //System.property is a method in java that retrieves system properties - basically, pieces of information
            //about the environment
            //user.home key specifically refers to the current user's home directory.
            //The "/Desktop" appends the string "/Desktop" to the home directory.

            //Create the file object pointing to the Desktop
            File my_obj = new File(desktop_path + "/FilePointing.txt");
            if (my_obj.createNewFile()) {
                System.out.println("File Created:" + my_obj.getAbsolutePath());
            } else {
                System.out.println("File already exists at:" + my_obj.getAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println("An error occurred!");
            e.printStackTrace();
        }
    }
}

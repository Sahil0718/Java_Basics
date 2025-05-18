package File_Reader;

import java.io.File;

public class ReadingTheCreatedFile {
    public static void main(String[] args) {
        String desktop_path = System.getProperty("user.home") + "/Desktop";
        File my_obj = new File(desktop_path + "/FilePointing.txt");
        if (my_obj.exists()) {
            System.out.println("File Name: " + my_obj.getName());
            System.out.println("Absolute Path: " + my_obj.getAbsolutePath());
            System.out.println("Writable: " + my_obj.canWrite());
            System.out.println("Readable: " + my_obj.canRead());
            System.out.println("File size in byte: " + my_obj.length());

        } else {
            System.out.println("File does not exists!");
        }
    }
}

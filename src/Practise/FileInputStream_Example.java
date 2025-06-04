package Practise;

import java.io.*;

public class FileInputStream_Example {
    public static void main(String[] args) {
        try {
            FileInputStream fn = new FileInputStream("C:\\Users\\Asus\\IdeaProjects\\Java_Basics\\src\\abc.txt");

            int i;
            while ((i = fn.read()) != -1) {
                System.out.println((char) i);
            }
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
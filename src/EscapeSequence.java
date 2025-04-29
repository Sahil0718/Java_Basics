//In Java, escape sequences are special characters used to represent certain whitespace or
//non-printable characters inside String or char literals. They always begin with a backslash (\)
//followed by a character. These sequences allow you to format strings in special ways like adding new lines,
// tabs, quotes, etc.


// Java variable is better to write in camelCase: myVariableName
// Integer literals --> 10, 20, 30, 40
// Boolean literals --> true, false
// Character literals --> 'A', 'B', '1', '@'

import java.util.Scanner;

public class EscapeSequence {
    public static void main(String[] args) {
        // Using escape sequences
        System.out.println("Hello\tWorld!");           // Tab space
        System.out.println("This is on a\nnew line."); // New line
        System.out.println("She said, \"Java is fun!\""); // Double quote
        System.out.println("Backslash: \\");           // Backslash
        System.out.println("Single quote: \'");        // Single quote
    }
}


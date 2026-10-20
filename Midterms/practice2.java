package Midterms;

import java.util.Arrays;

public class practice2 {
    public static void main(String[] args) {
        boolean[] boolArray = new boolean[3];
        char[] charArray = new char[3];

        // This will print: [false, false, false]
        System.out.println("Boolean default: " + Arrays.toString(boolArray));

        // This will print: [, , ] because the null character is invisible!
        System.out.println("Char default: " + Arrays.toString(charArray));
        
        // To prove it's a 0 value under the hood, let's cast it to an int:
        System.out.println("Char numerical value: " + (int)charArray[0]);
    }
}

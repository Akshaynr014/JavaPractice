package array_example;

import java.util.Scanner;

public class Char {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the character array: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // consume the newline

        char[] store = new char[size];
        
        for (int i = 0; i < size; i++) {
            System.out.print("Enter character " + (i + 1) + ": ");
            String input = scanner.nextLine();
            
            if (!input.isEmpty()) {
                store[i] = input.charAt(0); // take the first character
            } else {
                System.out.println("Empty input! Setting default value '_'");
                store[i] = '_';
            }
        }

        // Convert to string and print
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : store) {
            stringBuilder.append(c);
        }

        System.out.println("The combined word is: " + stringBuilder.toString());
        
        scanner.close();
    }
}


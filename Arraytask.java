package array_example;

import java.util.Scanner;

public class Arraytask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int size = scanner.nextInt();

        int[] store = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            store[i] = scanner.nextInt();
        }

        System.out.println("Array elements are:");
        for (int i = 0; i < size; i++) {
            System.out.println(store[i]);
        }

        scanner.close();
    }
}


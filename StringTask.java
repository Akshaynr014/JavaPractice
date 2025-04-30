package array_example;

import java.util.Scanner;

public class StringTask {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number of fruits:");
		int size = scanner.nextInt();
		scanner.nextLine(); 

		String[] fruits = new String[size];

		System.out.println("Enter the names of fruits:");
		for (int i = 0; i < size; i++) {
			System.out.print("Fruit " + (i + 1) + ": ");
			fruits[i] = scanner.nextLine();
		}

		System.out.println("\nList of fruits:");
		for (int i = 0; i < size; i++) {
			System.out.println(fruits[i]);
		}

		scanner.close();

	}

}

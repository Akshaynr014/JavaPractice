package array_example;

import java.util.Scanner;

public class DepartmentEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of departments: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // consume newline

        Department[] departments = new Department[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter name for department " + (i + 1) + ": ");
            String name = scanner.nextLine();
            departments[i] = new Department(name);
        }

        System.out.println("\nDepartment Details:");
        for (Department dept : departments) {
            System.out.println(dept);
        }

        scanner.close();
    }
}


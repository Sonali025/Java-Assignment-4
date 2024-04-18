package JavaAssignment4;

import java.util.Scanner;

public class Ques6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter elements for array: ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		try {
			System.out.println("Enter the index position from 0 to " + size + ":");
			int position = sc.nextInt();
			System.out.println("Value for index " + position + " is: " + arr[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// System.out.println("Invalid index position");
			System.out.println("Enter valid position");
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}

	}

}

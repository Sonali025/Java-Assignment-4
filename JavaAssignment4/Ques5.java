package JavaAssignment4;

import java.util.*;

public class Ques5 {

	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		try {
			String num = sc.next();
			int num1 = Integer.parseInt(num);
			int square = num1 * num1;
			System.out.println("Square of given number: " + square);
		} catch (Exception e) {
			System.out.println("Enter valid input");
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}

	}

}

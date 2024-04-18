package JavaAssignment4;
import java.util.*;

class Myclass extends Exception {
	public Myclass(String msg) {
		super(msg);
	}
}

public class Ques8 {
	public static void Myclass(String input) throws Myclass {
		boolean containsVowels = false;
		String vowel = "AEIOUaeiou";
		for (int i = 0; i < input.length(); i++) {
			char test = input.charAt(i);
			if (vowel.contains(String.valueOf(test))) {
				containsVowels = true;
				break;
			}
		}
		if (!containsVowels) {
			throw new Myclass("This String does not contain any vowels");
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		try {
			String input = sc.next();
			Myclass(input);
			System.out.println("The String contains Vowels...");
		} catch (Myclass e) {
			System.out.println(e.getMessage());
		}


	}

}

package regex_example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationOfGmailId {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Gmail Id");
		String email = scanner.next();
		scanner.close();
		Pattern pattern = Pattern.compile("([a-zA-Z]+)([a-zA-Z0-9_.])*@gmail.com");
		Matcher matcher = pattern.matcher(email);
		System.out.println(matcher.find() && email.equals(matcher.group()));
		System.out.println(matcher.group());
	}

}

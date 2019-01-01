package regex_example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateMobileNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Mobile Number");
		String mobileNumber = scanner.next();
		scanner.close();
		Pattern pattern = Pattern.compile("((0|91)?[6-9])+([0-9]){9}");
		Matcher matcher = pattern.matcher(mobileNumber);
		System.out.println(matcher.find() && mobileNumber.equals(matcher.group()));
		System.out.println(matcher.group());
	}

}

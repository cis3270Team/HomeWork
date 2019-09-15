package baseConversion;

import java.util.Scanner;

public class Base16_To_Base10 {

	public static void main(String[] args) {

		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Prompt the user for input
		System.out.print("Enter Hex value (e.g. FCB92): ");
		String hexValue = input.next().toUpperCase();

		// Check validity of input
		for (int i = 0; i < hexValue.length(); i++) {
			if (hexValue.charAt(i) < '0' || hexValue.charAt(i) > 'F') {
				System.out.println(hexValue.charAt(i) + " is an invalid input!");
				System.exit(1);
			}
		}

		// Display the conversion result
		System.out.println("The Base10 conversion of " + hexValue + " is " + 
							getBase10_Value(hexValue));

	}

	// Method for the conversion
	public static int getBase10_Value(String hexValue) {

		int result = 0;

		for (int i = 0, j = hexValue.length() - 1; i < hexValue.length(); i++, j--) {

			if (hexValue.charAt(i) >= 'A' && hexValue.charAt(i) <= 'F') {
				result += ((hexValue.charAt(i) - 'A') + 10) * Math.pow(16, j);
			} else
				result += (hexValue.charAt(i) - '0') * Math.pow(16, j);

		}

		return result;
	}

}

package baseConversion;

import java.util.Scanner;

public class Base2_To_Base10 {

	public static void main(String[] args) {

		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user for input
		System.out.print("Enter a binary value (e.g. 11101): ");
		int value = input.nextInt();
		
		// Display result
		System.out.println("The Base10 conversion of " + value + " is " + 
							getConversion(value));

	}
	
	// Method for converting from Base2 to Base10
	public static int getConversion(int value) {
		
		String check = "" + value;
		
		int result = 0;
		
		for (int i = value, j = 0; j <= check.length()-1; i /= 10, j++) {
			result += (i % 10) * Math.pow(2, j);
		}
		
		return result;
	}

}

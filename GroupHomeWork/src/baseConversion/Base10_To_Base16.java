package baseConversion;

import java.util.Scanner;

public class Base10_To_Base16 {

	public static void main(String[] args) {

		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Prompt the user for input
		System.out.print("Enter an integer value: ");
		int value = input.nextInt();

		// Display result of the conversion
		printHex(value);

	}

	// Method for printing the conversion result
	public static void printHex(int value) {

		System.out.print("The hexadecimal conversion of " + value + " is ");
		int[] result = getHexadecimal(value);
		for (int i = 0; i < result.length; i++) {
			if (result[i] >= 10 && result[i] <= 15) {
				char[] hexValue = { 'A', 'B', 'C', 'D', 'E', 'F' };
				System.out.print(hexValue[result[i] - 10]);
			} else
				System.out.print(result[i]);
		}

	}

	// Method for the conversion
	public static int[] getHexadecimal(int value) {

		// Create an array to store result of the conversion
		int[] result = new int[getNumberOfElements(value)];
		for (int i = value, j = result.length - 1; i > 0 && j >= 0; --j, i /= 16) {
			result[j] = i % 16;
		}

		return result;
	}

	// Method for finding number of elements in result array
	public static int getNumberOfElements(int value) {

		int count = 0;

		for (int i = value; i > 0; i /= 16) {
			count++;
		}

		return count;
	}

}

package baseConversion;

import java.util.Scanner;

public class Base10_To_Base2 {

	public static void main(String[] args) {

		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Prompt the user for input
		System.out.print("Enten an integer value: ");
		int value = input.nextInt();

		// Print result
		System.out.print("The binary conversion of " + value + " is ");
		int[] result = getBinaryConversion(value);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
		}

	}

	// Method for converting from Base10 to Base2
	public static int[] getBinaryConversion(int value) {

		// Create an array to hold result
		int[] result = new int[getNumberofElements(value)];

		// Convert from Base10 to Base2
		for (int i = value, j = result.length - 1; i > 0 && j >= 0; i /= 2, --j) {
			result[j] = i % 2;
		}

		return result;
	}

	// Method for finding the number of elements required in the result array.
	public static int getNumberofElements(int value) {

		int count = 0;

		for (int i = value; i > 0; i /= 2) {
			count++;
		}

		return count;
	}

}

package baseConversion;

public class Base10_To_Base2 {
	
	public static void main(String[] args) {
	
	// Create a Scanner object
	java.util.Scanner input = new java.util.Scanner(System.in);
	
	// Prompt the user for input
	System.out.print("Enten an integer: ");
	int num = input.nextInt();
	
	// Create an array to hold result
	int[] result = new int[num/10];
	
	// Convert num to base2
	for (int i = num, j = result.length-1; i > 0 && j>=0; i /= 2, --j) {
		result[j] = i % 2;
	}
	
	// Print result
	for (int i = 0; i < result.length; i++) {
		System.out.print(result[i]);
	}
	
	}

}

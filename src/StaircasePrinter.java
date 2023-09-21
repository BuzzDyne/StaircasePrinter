import java.util.Scanner;

public class StaircasePrinter {
	private static final int MIN_LEVEL = 1;
	private static final int MAX_LEVEL = 100;
	private static final String INPUT_TEXT = "Input Staircase levels (from " + MIN_LEVEL + " to " + MAX_LEVEL + "): ";
	private static final String REINPUT_TEXT = "Invalid input.\nInput Staircase levels (from " + MIN_LEVEL + " to " + MAX_LEVEL + "): ";
	
	public static void main(String[] args) {
		int nLevel = getUserInput();
		
		// System.out.println("You entered the number: " + nLevel);
		
		printStaircase(nLevel);
	}
	
 	private static int getUserInput() {
		Scanner sc = new Scanner(System.in);
		int userInput;
				
		System.out.print(INPUT_TEXT);
		
		while (true) {
	        if (sc.hasNextInt()) {
	        	userInput = sc.nextInt();

	            // Check if the input is within the allowed range
	            if (isInputValid(userInput)) {
	                break; // Valid input, exit the loop
	            } else {
	                System.out.print(REINPUT_TEXT);
	            }
	        } else {
	            // Clear the invalid input
	            sc.nextLine();
	            System.out.print(REINPUT_TEXT);
	        }
		}
		
		sc.close();
		
		return userInput;
	}

	private static boolean isInputValid(int input) {
		return input >= MIN_LEVEL && input <= MAX_LEVEL;
	}
	
	private static void printStaircase(int level) {
        for (int i = 1; i <= level; i++) {
            // Print spaces
            for (int j = 1; j <= level - i; j++) {
                System.out.print("  ");
            }
            // Print '# '
            for (int j = 1; j <= i; j++) {
                System.out.print("# ");
            }
            // Move to the next line
            System.out.println();
        }
	}
}

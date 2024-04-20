package core;

public class star_pattern {
	public static void main(String[] args) {
		
		        // Number of rows in the pattern
		        int rows = 5;
		        
		        // Outer loop for each row
		        for (int i = 1; i <= rows; i++) {
		            // Print leading spaces
		            for (int j = rows; j > i; j--) {
		                System.out.print(" ");
		            }
		            // Print stars for each row
		            for (int k = 1; k <= (2 * i - 1); k++) {
		                System.out.print("*");
		            }
		            // Move to the next line
		            System.out.println();
		        }
		    }
		
	}


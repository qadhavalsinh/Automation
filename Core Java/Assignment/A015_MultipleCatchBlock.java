import java.util.InputMismatchException;
import java.util.Scanner;

public class A015_MultipleCatchBlock {
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        try {
	            System.out.print("Enter numerator (integer): ");
	            int numerator = scanner.nextInt();

	            System.out.print("Enter denominator (integer): ");
	            int denominator = scanner.nextInt();

	            int result = numerator / denominator; 

	            System.out.println("Result = " + result);

	        } catch (ArithmeticException e) {
	            System.out.println("Error: Cannot divide by zero.");
	        } catch (InputMismatchException e) {
	            System.out.println("Error: Invalid input. Please try again with valid Num");
	        } catch (Exception e) {
	            System.out.println("An unexpected error occurred: " + e.getMessage());
	        } finally {
	            System.out.println("Your are successfull.");
	            scanner.close();
	        }
	    }
}

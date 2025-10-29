import java.util.Scanner;

public class A021_ReverseArray {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of elements in the array: ");
	        int n = scanner.nextInt();

	        int[] array = new int[n];
	        System.out.println("Enter " + n + " integer values:");
	        for (int i = 0; i < n; i++) {
	            array[i] = scanner.nextInt();
	        }
	        for (int i = 0; i < n / 2; i++) {
	            int temp = array[i];
	            array[i] = array[n - 1 - i];
	            array[n - 1 - i] = temp;
	        }
	        System.out.println("Reversed array:");
	        for (int value : array) {
	            System.out.print(value + " ");
	        }
	        System.out.println();

	        scanner.close();
	    }
}

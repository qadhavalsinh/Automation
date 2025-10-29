import java.util.Scanner;

public class A022_SecondLargest {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of elements: ");
	        int n = scanner.nextInt();
	        if (n < 2) {
	            System.out.println("Array must have at least 2 elements.");
	            return;
	        }

	        int[] array = new int[n];

	        System.out.println("Enter " + n + " integer values:");
	        for (int i = 0; i < n; i++) {
	            array[i] = scanner.nextInt();
	        }

	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;

	        for (int num : array) {
	            if (num > largest) {
	                secondLargest = largest;
	                largest = num;
	            } else if (num > secondLargest && num != largest) {
	                secondLargest = num;
	            }
	        }

	        if (secondLargest == Integer.MIN_VALUE) {
	            System.out.println("There is no distinct second largest element.");
	        } else {
	            System.out.println("Second largest element is: " + secondLargest);
	        }

	        scanner.close();
	    }
}

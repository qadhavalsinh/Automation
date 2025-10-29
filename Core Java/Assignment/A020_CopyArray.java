import java.util.Scanner;

public class A020_CopyArray {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] originalArray = new int[n];
        int[] copiedArray = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            originalArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            copiedArray[i] = originalArray[i];
        }

        System.out.println("Copied Array:");
        for (int value : copiedArray) {
            System.out.print(value + " ");
        }
        System.out.println();

        scanner.close();
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class A008_SumOfArray {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        System.out.println("Sum of the array elements is: " + sum);

        scanner.close();
    }
}

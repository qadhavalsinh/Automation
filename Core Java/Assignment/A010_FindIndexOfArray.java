import java.util.Scanner;

public class A010_FindIndexOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.print("Enter the element to find: ");
        int target = scanner.nextInt();

        int index = -1; 

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                index = i;
                break; 
            }
        }

        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }

        scanner.close();
    }
}

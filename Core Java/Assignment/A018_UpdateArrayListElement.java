import java.util.ArrayList;
import java.util.Scanner;

public class A018_UpdateArrayListElement {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        System.out.print("Enter the index of element to update (0 to " + (list.size() - 1) + "): ");
        int index = scanner.nextInt();

        if (index < 0 || index >= list.size()) {
            System.out.println("Invalid index!");
        } else {
            System.out.print("Enter the new element: ");
            int newElement = scanner.nextInt();

            list.set(index, newElement);

            System.out.println("Updated ArrayList:");
            for (int element : list) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

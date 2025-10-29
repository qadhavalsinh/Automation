import java.util.ArrayList;
import java.util.Scanner;

public class A019_RemoveThirdElement {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextLine());
        }

        if (list.size() >= 3) {
            list.remove(2);
            System.out.println("Third element removed successfully.");
        } else {
            System.out.println("The list has fewer than 3 elements. Cannot remove the third element.");
        }

        System.out.println("Updated ArrayList:");
        for (String item : list) {
            System.out.println(item);
        }

        scanner.close();
    }
}

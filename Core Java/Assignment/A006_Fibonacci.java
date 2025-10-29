import java.util.Scanner;

public class A006_Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of terms for Fibonacci series: ");
        int terms = scanner.nextInt();

        int first = 0, second = 1;

        System.out.println("Fibonacci Series up to " + terms + " terms:");

        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        scanner.close();
    }
}

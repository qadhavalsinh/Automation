import java.util.Scanner;

public class A013_EndOFAnotherString {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the string to concatenate: ");
        String str2 = scanner.nextLine();

        String result = str1 + str2;

        System.out.println("Concatenated string: " + result);

        scanner.close();
    }
}

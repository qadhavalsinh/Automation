import java.util.Scanner;

public class A012_CompareTwoString {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        if (str1.equals(str2)) {
            System.out.println("Your Number is match");
        } else {
            System.out.println("Your number is not match");
        }

        scanner.close();
    }
}

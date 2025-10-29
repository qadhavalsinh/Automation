import java.util.Scanner;

public class A007_testcode {
	public static void main(String[] args) {
          
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your marks : ");
        
        int physics = scan.nextInt();
        System.out.println("Enter your physics marks : ");
        int chemistry = scan.nextInt();
        System.out.println("Enter your chemistry marks : ");
        int english = scan.nextInt();
        System.out.println("Enter your english marks : ");
        int maths = scan.nextInt();
        System.out.println("Enter your maths marks : ");
        int science = scan.nextInt();
        System.out.println("Enter your science marks : ");
        int sciences = scan.nextInt();
        
        float percentage = ((physics+chemistry+english+maths+science)/500.0f)*100;
        
        System.out.println("Percentage : ");
        System.out.println(percentage);
    }
}

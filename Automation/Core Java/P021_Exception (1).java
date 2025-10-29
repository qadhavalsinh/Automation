package core;

import java.util.InputMismatchException;
import java.util.Scanner;

class Calculate { // B -> developer
	public void division() throws ArithmeticException,InputMismatchException{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a = ");
		int a = sc.nextInt();
		System.out.println("enter b = ");
		int b = sc.nextInt();
		int c = a / b;
		System.out.println(c);

//		try {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("enter a = ");
//			int a = sc.nextInt();
//			System.out.println("enter b = ");
//			int b = sc.nextInt();
//			if(b > 0) {
//				int c = a / b;
//				System.out.println(c);
//			}
//			else {
//				throw new ArithmeticException("msg");
//			}
//		} catch (ArithmeticException e) {
//			System.out.println("denominator is less than 0");
//		}
	}
}

public class P021_Exception { // A -> tester
	public static void main(String[] args) {
		
		try {
			Calculate c = new Calculate();
			c.division();
		} catch (ArithmeticException e) {
			System.out.println("less than 0");
		}
		catch(InputMismatchException e) {
			System.out.println("not numeric");
		}
		
		
//		try {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("enter a = ");
//			int a = sc.nextInt();
//			System.out.println("enter b = ");
//			int b = sc.nextInt();
//			int c = a / b;
//			System.out.println(c);
//
//			System.exit(12);
//		} catch (ArithmeticException e) {
//			System.out.println("denominator should be greater than 0");
//		} catch (InputMismatchException e) {
//			System.out.println("denominator should be numeric value");
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			System.out.println("finally will executes evrytime");
//		}

	}
}

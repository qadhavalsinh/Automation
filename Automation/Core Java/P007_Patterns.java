package core;

public class P007_Patterns {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("==========");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("==========");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("==========");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println("==========");
		int counter= 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(counter+" ");
				counter++;
			}
			System.out.println();
		}
		
		
		System.out.println("==========");

		for (int i = 1; i <= 5; i++) {
			for(int s=4;s>=i;s--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}
}

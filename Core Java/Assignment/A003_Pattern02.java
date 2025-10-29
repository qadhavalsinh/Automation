public class A003_Pattern02 {
	public static void main(String[] args) {
		int space = 3;
		int star = 1;
		for (int i = 1; i <= 7; i++) {
			for(int j = 1 ; j <= space ; j++) {
				System.out.print("  ");
			}
			for(int j = 1 ; j<= star ; j++) {
				System.out.print("* ");
			}
			if(i < 4) {
				space = space-1;
				star = star+2;
			}
			if(i >= 4) {
				space = space+1;
				star = star-2;
			}
			System.out.println();
		}			
	}
}
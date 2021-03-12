package pyramid;

public class Pyramid {
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < (i + 1)*2 -1; k++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		for(int l = 0; l < 5; l++) {
			for(int m = 0; m < l ; m++) {
				System.out.print(" ");
			}
			for(int n = 0; n < (5 - l)*2 - 1; n++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	
	}

}

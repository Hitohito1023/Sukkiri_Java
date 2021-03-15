package chapter15;

public class Main2 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 1000; i++) {
			sb.append("Java");
		}
		String s = sb.toString();
	}

}

package chapter15;

public class Main2 {
	public static void main(String[] args) {
//		StringBuilder sb = new StringBuilder();
//		for(int i = 0; i < 1000; i++) {
//			sb.append("Java");
//		}
//		String s = sb.toString();
		
//		String s = "abc,def:ghi";
//		String[] words = s.split("[,:]");
//		System.out.println(Arrays.toString(words));
//		for (String w : words) {
//			System.out.print(w + "->");
//		}
		
		String s = "abc,def:ghi";
		String w = s.replaceAll("[beh]", "x");
		System.out.println(w);
	}

}

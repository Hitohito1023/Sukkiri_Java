package reChapter15;

public class Main4 {

	public static void main(String[] args) {
		String s = "abc,def:ghi";
		String[] words = s.split("[,:]");
//		for(String w : words) {
//			System.out.println(w + "->");
//		}
		System.out.println(words[0]);

	}

}

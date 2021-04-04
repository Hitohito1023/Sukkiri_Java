package reChapter16;

import java.util.TreeSet;

public class Main3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		
//		HashSet<String> colors = new HashSet<String>();
//		colors.add("blue");
//		colors.add("yellow");
//		colors.add("red");
//		
//		colors.add("red");
//		System.out.println(colors.size() + "colors");
//		
//		for(String s : colors) {
//			System.out.println(s);
//		}
//		
		TreeSet<String> words = new TreeSet<String>();
		words.add("dog");
		words.add("cat");
		words.add("wolf");
		words.add("panda");
		words.add("bird");
		for(String w : words) {
			System.out.println(w);
		}

	}

}

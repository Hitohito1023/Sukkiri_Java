package chapter16;

import java.util.HashSet;
import java.util.Set;

public class Main2 {
	public static void main(String[] args) {
		Set<String> colors = new HashSet<String>();
		colors.add("red");
		colors.add("yellow");
		colors.add("blue");
		colors.add("red");
		for (String c : colors) {
			System.out.print(c + "->");
		}
//		System.out.println("色は" + colors.size() + "種類");
	}

}

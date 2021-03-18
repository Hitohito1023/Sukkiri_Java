package chapter16;
//import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("ミナト");
		names.add("リョウタ");
		names.add("ユウタ");
		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			String e = it.next();
			System.out.println(e);
		}
		
		
//		ArrayList<Integer> points = new ArrayList<Integer>();
//		points.add(10);
//		points.add(80);
//		points.add(75);
//		for (int i : points) {
//			System.out.println(i);
//		}
	}
}

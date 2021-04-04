package reChapter16;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

//		ArrayList<String> names = new ArrayList<String>();
//
//		names.add("ryota");
//		names.add("taro");
//		names.add("takeshi");
//
//		System.out.println(names.get(0));
//		System.out.println(names.get(2));

		ArrayList<Integer> points = new ArrayList<Integer>();
		points.add(20);
		points.add(100);
		points.add(25);
		for (int i : points) {
			System.out.println(i);
		}
		System.out.println(points.size());
		
		for(int i = 0; i < points.size(); i++) {
			System.out.println(points.get(i));
		}

	}

}

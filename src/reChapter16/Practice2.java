package reChapter16;

import java.util.HashMap;
import java.util.Map;

public class Practice2 {
//
	public static void main(String[] args) {
//		// TODO 自動生成されたメソッド・スタブ
		He h1 = new He("斉藤");
		He h2 = new He("鈴木");
//		ArrayList<Hero> list = new ArrayList<Hero>();
//		list.add(h1);
//		list.add(h2);
//		for(Hero s : list) {
//			System.out.println(s.getName());
//		}
		
		Map<He, Integer> heros = new HashMap<He, Integer>();
		heros.put(h1, 3);
		heros.put(h2, 7);
		for(He key : heros.keySet()) {
			int value = heros.get(key);
			System.out.println(key.getName() + "が倒した敵＝" + value);
		}
//
//
	}

}

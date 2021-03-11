package chapter7;

public class Main {
	public static void main(String[] args) {
		// 勇者を作成
		Hero h = new Hero();  //Heroクラスからインスタンスを生成し、変数hに入れる
		// 勇者のフィールドに初期値をセット
		h.name = "リョウタ";  //Heroクラスのhのフィールドにnameを代入
		h.hp = 100;
		// お化けキノコの作成
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';
		
		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';
		
		Cleric c = new Cleric();
		c.name = "あいう";
		
		System.out.println("勇者" + h.name + "が誕生しました!!");
		// メソッドを呼び出す
		h.slip();
		m1.run();
		m2.run();
		h.run();
		c.selfAid();
		c.pray(10);
		
	}

}

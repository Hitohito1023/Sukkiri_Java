package chapter7;

public class Main {
	public static void main(String[] args) {
		// 勇者を作成
		Hero h = new Hero();  //Heroクラスからインスタンスを生成し、変数hに入れる
		// 勇者のフィールドに初期値をセット
		h.name = "リョウタ";  //Heroクラスのhのフィールドにnameを代入
		h.hp = 100;
		System.out.println("勇者" + h.name + "が誕生しました!!");
		// 勇者のメソッドを呼び出す
		h.sit(5);
		h.slip();
		h.sit(25);
		h.run();
		
		
	}

}

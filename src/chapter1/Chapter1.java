package chapter1;

public class Chapter1 {
	public static void main (String[] args) {
		//変数の定義
		int age;
		age = 30;
		System.out.println("私の年齢は" + age + "歳です");
		//変数の上書き
		age = 25;
		System.out.println("本当は" + age + "歳です。");
		//定数の定義
		final double PI;
		PI = 3.14;

		int pie = 5;
		System.out.println("半径" + pie + "cmの円の面積は、");
		System.out.println(pie * pie * PI);

		System.out.println("半径を倍にします");
		//定数の上書きはできないのでエラーは発生する
		/**
		PI = 10;
		System.out.println("半径" + pie + "cmの円の面積は、");
		System.out.println(pie * pie * PI);
		**/
	}
}

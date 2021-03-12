package chapter10;

import chapter7.Matango;

public class Hero {
	String name = "リョウタ";
	int hp = 100;

	public final void attack(Matango m) {
		System.out.println(this.name + "の攻撃!");
//		m.hp -= 5;
		System.out.println("5ポイントのダメージを与えた！");
	}

	public void run() {
		System.out.println(this.name + "は逃げ出した!");
	}

}

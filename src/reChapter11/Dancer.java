package reChapter11;

public class Dancer extends Character {

	int pp;

	public void dance() {
		System.out.println(this.name + "は踊った");
	}

	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃!!");
		System.out.println("敵に3ポイントのダメージ");
		m.hp -= 3;
	}

	public Dancer(String name, int hp, int pp) {
		this.name = name;
		this.hp = hp;
		this.pp = pp;
	}

}

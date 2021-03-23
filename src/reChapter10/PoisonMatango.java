package reChapter10;

public class PoisonMatango extends Matango {

	int ap = 5;


	public void attack(Hero h) {
		super.attack(h);
		if (this.ap > 0) {
			System.out.println("さらに毒の胞子をばらまいた");
			int damage = h.hp / 5;
			h.hp -= damage;
			System.out.println(damage + "ポイントのダメージ");
			this.ap--;
		}
	}

	public PoisonMatango(char suffix) {
		super(suffix);
//		System.out.println("PoisonMatango" + this.suffix + "が作成されました");
	}

}

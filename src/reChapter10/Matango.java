package reChapter10;

public class Matango {
	int hp = 50;
	char suffix;

	public Matango(char suffix) {
		this.suffix = suffix;
//		System.out.println("Matango" + this.suffix + "が作成されました");
	}

	public void attack(Hero h) {
		System.out.println("キノコ" + this.suffix + "の攻撃！");
		System.out.println("10のダメージ");
		h.hp -= 10;
	}

}

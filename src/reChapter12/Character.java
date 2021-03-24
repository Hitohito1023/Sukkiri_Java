package reChapter12;

public abstract class Character {

	String name;
	int hp;
	public void run() {

	}

	public abstract void attack(Matango m) ;
	
	public void fireball(Matango m) {
		System.out.println("敵に20ポイントのダメージ");
	}


}

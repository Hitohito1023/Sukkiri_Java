package reChapter10;

public class Main {
	public static void main(String[] args) {
//		SuperHero sh = new SuperHero();
//		sh.run();
//
		Hero h = new Hero();
		h.run();

//		Weapon w = new Weapon();

//		Matango m = new Matango('A');

		PoisonMatango pm = new PoisonMatango('B');
		
		pm.attack(h);
	}

}

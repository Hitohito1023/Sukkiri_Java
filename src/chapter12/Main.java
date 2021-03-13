package chapter12;

public class Main {
	public static void main(String[] args) {
//		Wizzard w = new Wizzard();
//		Character c = w;
//		Matango m = new Matango();
//		c.name = "アサカ";
//		c.attack(m);
//		c.fireball(m);
		Slime s = new Slime();
		Monster m = new Slime();
		s.run();
		m.run();
	}

}

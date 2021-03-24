package reChapter12;

public class Main {
	public static void main(String[] args) {
//		Wizard w = new Wizard();
//		Matango m = new Matango();
//		Character c = w;
//		w.name = "ryota";
//		w.attack(m);
//		w.fireball(m);
//		c.attack(m);
//		c.fireball(m);
		
//		Slime s = new Slime();
//		Monster m = new Slime();
//		s.run();
//		m.run();
		
		Y[] array = new Y[2];
		array[0] = new A();
		array[1] = new B();
		
		for(Y y : array) {
			y.b();
		}
	}

}

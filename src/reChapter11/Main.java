package reChapter11;

public class Main {
	public static void main(String[] args) {
		Dancer d = new Dancer("ryota", 100, 30);
		Matango m = new Matango();

		System.out.println(d.name);
		System.out.println(d.hp);
		System.out.println(d.pp);
		d.attack(m);
		d.dance();
	}

}

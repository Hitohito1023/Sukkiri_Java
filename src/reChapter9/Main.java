package reChapter9;

public class Main {
	public static void main(String[] args) {
//		Sword s = new Sword();
//		s.name = "炎の剣";
//		s.damage = 10;
//		Hero h;
//		h = new Hero();
//		h.name = "ryota";
//		h.hp = 100;
//		h.sword = s;
//		System.out.println("現在の武器は" + h.sword.name);

//		Hero h1 = new Hero();
//		h1.name = "minato";
//		h1.hp = 100;
//		Hero h2 = new Hero();
//		h2.name = "ryota";
//		h2.hp = 100;
//		Wizard w = new Wizard();
//		w.name = "taro";
//		w.hp = 50;
//		w.heal(h1);
//		w.heal(h2);
//		w.heal(h2);

		Hero h = new Hero("ryota");
		System.out.println(h.name + "&" + h.hp);
	}

}

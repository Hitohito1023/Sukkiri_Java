
public class Cleric {
	String name;
	int hp = 50;
	final int MAX_HP = 50;
	int mp = 10;
	final int MAX_MP = 10;
	
	public void selfAid() {
		System.out.println("セルフエイドを唱えた。");
		this.mp -= 5;
		this.hp = this.MAX_HP;
		System.out.println("MPを5消費して、HPを全回復しました。");
	}
	
	public int pray(int sec) {
		System.out.println(this.name + "は" + sec + "秒間、天に祈った。");
		int r = new java.util.Random().nextInt(3);
		int recoverActual = Math.min(this.MAX_MP - this.mp, r + sec);
		this.mp += recoverActual;
		System.out.println("MPが" + recoverActual + "回復した");
		return recoverActual;
	}
	

}

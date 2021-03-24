package reChapter13;

public class Hero {
	private int hp;
	String name;
	Sword sword;

	void sleep() {
		this.hp -= 100;
		System.out.println(this.name + "は、眠って回復した！");
	}

	private void die() {
		System.out.println(this.name + "は死んでしまった");
		System.out.println("GAMEOVERです");
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

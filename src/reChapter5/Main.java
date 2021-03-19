package reChapter5;

public class Main {
	public static void main(String[] args) {
		System.out.println("メソッドの呼び出し");
		hello("リョウタ");
		System.out.println("メソッドの呼び出し終了");
	}

	public static void hello(String name) {
		System.out.println(name + "、こんにちは");
	}

}

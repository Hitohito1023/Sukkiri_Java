package reChapter5;

public class Main {
	public static void main(String[] args) {
		System.out.println("メソッドの呼び出し");
		hello("リョウタ");
		System.out.println("メソッドの呼び出し終了");
		int a = add(300, 599);
		System.out.println(a);
	}

	public static void hello(String name) {
		System.out.println(name + "、こんにちは");
	}
	
	public static int add(int x, int y) {
		int ans = x + y;
		return ans;
//		System.out.println(x + "+" + y + "=" + ans); 
	}

}

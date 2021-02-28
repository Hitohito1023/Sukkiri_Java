package chapter2;

public class Chapter2 {
	public static void main(String[] args) {
		int a;
		int b;
		a = 20;
		b = a + 5;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println("私が好きな記号は（\"）です");
		System.out.println("\"¥");
		
		a = 100;
		a++;
		System.out.println(a);
		
		int weight = (int)3.5;
		System.out.println(weight);
		System.out.print("こんにちは");
		System.out.print("おはよう");
		
		int m = Math.max(a, b);
		System.out.println("比較実験：" + a + "と" + b + "とで大きい方は..." + m);
		
		String age = "31";
		int n = Integer.parseInt(age);
		System.out.println("私の年齢は" + n + "歳です");
		
		int r = new java.util.Random().nextInt(90);
		System.out.println("あなたの年齢は" + r + "歳です");
		
		System.out.println("あなたの名前を入力してください");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください");
		int old = new java.util.Scanner(System.in).nextInt();
		System.out.println("ようこそ、" + old + "歳の" + name + "さん");
	}

}

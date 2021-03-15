package chapter15;

public class Time {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
			int a = 10;
			int b = 20;
			int sum = a + b;
		
		long end = System.currentTimeMillis();
		System.out.println("処理にかかった時間は・・・" + (end - start) + "ミリ秒でした。");
	}

}

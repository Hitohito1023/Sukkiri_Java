package reChapter5;

public class Main4 {
	
	public static void introduceOneself() {
		String name = "ryota";
		int age = 25;
		double height = 168.5;
		char eto = '猪';
		System.out.println("名前は" + name + "です。");
		System.out.println("年齢は" + age + "です。");
		System.out.println("身長は" + height + "cmです。");
		System.out.println("干支は" + eto + "です。");
	}
	
	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました。");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}
	
	public static void email(String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました。");
		System.out.println("件名：無題");
		System.out.println("本文：" + text);
	}
	
	public static double calcTriangleArea(double bottom, double height) {
		double ans = bottom * height / 2;
		return ans;
	}
	
	public static double calcCircleArea(double radius) {
		double ans = radius * radius * 3.14;
		return ans;
	}
	
	public static void main(String[] args) {
		introduceOneself();
		email("こんにちは", "aaa@aaaa", "テストです");
		email("bb@bbbb", "テスト２です。");
		double area1 = calcTriangleArea(10.0, 5.0);
		double area2 = calcCircleArea(5.0);
		
		System.out.println(area1);
		System.out.println(area2);
	}

}

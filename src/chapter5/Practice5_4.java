package chapter5;

public class Practice5_4 {
	
	public static void main(String[] args) {
		double area1 = calcTriangleArea(10.0, 5.0);
		double area2 = calcCircleArea(5.0);
		System.out.println("三角形の面積は" + area1 + "平方cm");
		System.out.println("円の面積は" + area2 + "平方cm");
	}

	
	public static double calcTriangleArea(double bottom, double height) {
		double ans1 = bottom * height / 2;
		return ans1;
	}
	
	public static double calcCircleArea(double radius) {
		double ans2 = radius * radius * 3.14;
		return ans2;
	}
}

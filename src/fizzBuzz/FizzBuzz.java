package fizzBuzz;

public class FizzBuzz {
	public static void main(String[] args) {
		fizzbuzz();
	}
	
	public static void fizzbuzz() {
		System.out.println("数字を入力してください");
		int num = new java.util.Scanner(System.in).nextInt();
		if (num % 15 == 0) {
			System.out.println("FizzBuzz");
		} else if (num % 5 == 0) {
			System.out.println("Fizz");	
		} else if (num % 3 == 0) {
			System.out.println("Buzz");
		} else {
			System.out.println(num);
		}
	}

}

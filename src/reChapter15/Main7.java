package reChapter15;

import java.util.Date;

public class Main7 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		System.out.println(now.getTime());
		Date past = new Date(100705425827L);
		System.out.println(past);
	}

}

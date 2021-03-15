package chapter15;
import java.util.Calendar;
import java.util.Date;

public class Test {
	public static void main(String[] args) {
//		Date now = new Date();
//		System.out.println(now);
//		System.out.println(now.getTime());
//		Date past = new Date(1600705425827L);
//		System.out.println(past);
		
		Calendar c = Calendar.getInstance();
		c.set(2019,8,22,1,23,45);
		c.set(Calendar.MONTH, 9);
		Date d = c.getTime();
		System.out.println(d);
		
		Date now = new Date();
		c.setTime(now);
		int y = c.get(Calendar.YEAR);
		System.out.println("今年は" + y + "年です");
	}

}

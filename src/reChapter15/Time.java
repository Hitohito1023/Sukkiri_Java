package reChapter15;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Time {

	public static void main(String[] args) {
		Instant i1 = Instant.now();
		System.out.println(i1);
		
		Instant i2 = Instant.ofEpochMilli(1600705425827L);
		long l = i2.toEpochMilli();
		
		ZonedDateTime z1 = ZonedDateTime.now();
		ZonedDateTime z2 = ZonedDateTime.of(2020, 1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo"));
		
		

	}

}

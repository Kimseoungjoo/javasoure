package time;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

// ���� ��¥ �ҷ����� ��� 

public class LocalDateEx1 {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� E���� mm�� ss��");
		System.out.println(sdf.format(date));
		
		LocalDate currDate = LocalDate.now();
		System.out.println(currDate);
		
		LocalTime currTime = LocalTime.now();
		System.out.println(currTime);
		
		LocalDateTime currDateTime = LocalDateTime.now();
		System.out.println(currDateTime);
	}
}
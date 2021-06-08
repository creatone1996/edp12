package Exercise2;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class System_out_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("QUESTION 1");
		int i = 5;
		System.out.println(i);
		
		System.out.println("QUESTION 2");
		int i1 = 100000000;
		System.out.printf(Locale.US,"%,d%n" ,i1);
		
		System.out.println("QUESTION 3");
		float i2 = 5.567098f;
		System.out.printf("%5.4f%n",i2);
		
		System.out.println("QUESTION 4");
		String i3 = "Nguyen Van A";
		System.out.printf("Ho va Ten: " + i3 + " Va toi dang doc than");
		
		System.out.println("QUESTION 5");
		String pattern = "24/04/2020 11:16:20";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());
		System.out.println(date);
		
	}

}

package Exercise3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;


public class Random_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("QUESTION1");
		
		Random random = new Random();
		int n = random.nextInt();
		System.out.println("so tu nhien la:" + n);
		
System.out.println("QUESTION2");
		
		Random random1 = new Random();
		float n1 = random1.nextFloat();
		System.out.println("so thuc la:" + n1);
		
		
System.out.println("QUESTION3");
		String[] array = {"Hai","Son", "Hung", "Thanh", "Dung"};
		Random random2 = new Random();
		int n3 = random2.nextInt(array.length);
		System.out.println("tan cua ban trong lop la :" + array[n3]);
		
System.out.println("QUESTION4");	
		int minDay = (int) LocalDate.of(1995, 7, 24).toEpochDay(); 
		int maxDay = (int) LocalDate.of(1995, 12, 20).toEpochDay(); 
		System.out.println("minday:" + minDay);
		System.out.println("maxday:" + maxDay);
		long randomInt = minDay + random.nextInt(maxDay - minDay); 
		LocalDate randomDay = LocalDate.ofEpochDay(randomInt);
		System.out.println(randomDay);
		
System.out.println("QUESTION5");		
		int now = (int) LocalDate.now().toEpochDay();
		int randomDate = now - random.nextInt(365);
		LocalDate reusultDate = LocalDate.ofEpochDay(randomDate);
		System.out.println("Ngay Ngau Nhien la: " + reusultDate);
		
System.out.println("QUESTION6");		
		int now1 = (int) LocalDate.now().toEpochDay();
		int randomDate1 = now - random.nextInt(now1);
		LocalDate reusultDate1 = LocalDate.ofEpochDay(randomDate1);
		System.out.println("Ngay Ngua Nhien La: " + reusultDate1);		
		
		System.out.println("QUESTION7");	
		Random random3 = new Random();
		int i3 = 	random3.nextInt(999 - 100) + 100;	
		System.out.println("so ngau nhien co 3 chu so la: " + i3);
	}

}

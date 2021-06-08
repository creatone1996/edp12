package Exercise5;

import java.time.LocalDate;
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		System.out.println("Moi Ban NHap Vao Sinh Nhat");
		System.out.println("Moi ban nhap vao Nam Sinh");
		int year = sn.nextInt();
		System.out.println("Moi ban nhap vao Thang Sinh");
		int month = sn.nextInt();
		System.out.println("Moi ban nhap vao Ngay Sinh");
		int day = sn.nextInt();
		
		LocalDate birthday = LocalDate.of(year, month, day);
		System.out.println("Sinh Nhat cua Ban la: " + birthday);
	}

}

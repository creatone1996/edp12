package BTthem;

import java.util.Scanner;

public class BT5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Moi ban nhap vao cac he so a bac 2");
		float a = scanner.nextFloat();
		System.out.println("Moi ban nhap vao cac he so b bac 1");
		float b = scanner.nextFloat();
		System.out.println("Moi ban nhap vao cac he so c bac 0");
		float c = scanner.nextFloat();
		ketqua(a,b,c);
	}
	public static void ketqua (float a, float b, float c) {	
	if (a == 0) {
		if ( b== 0) {
		System.out.println("Phuong Trinh Vo Nghiem");
		} else { 
			System.out.println("Phuong trinh co nghiem" + (-b)/c);
		}
	};
	if (a != 0) {
		float Delta = (b*b) - 4*a*c;
	
		if (Delta < 0) {
			System.out.println("Phuong Trinh Vo Nghiem");
		} else if (Delta == 0) {
			System.out.println("Phuong trinh co 1 nghiem " + (-b)/(2*a));
		} else {
			float x1= (float) ((-b) + Math.sqrt(Delta)/(2*a));
			float x2= (float) ((-b) - Math.sqrt(Delta)/(2*a));
			System.out.println("Phuong trinh co 2 Nghiem " + "x1 = " + x1 + " va x2= "  + x2);
			
		}
	};
		
	}
}

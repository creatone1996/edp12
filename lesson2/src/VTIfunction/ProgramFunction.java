package VTIfunction;

import java.util.Scanner;

public class ProgramFunction {

	public static void main(String[] args) {
		int nhap;
		System.out.println("Chao Mung Ban Den Voi Ngan Hang VTI");
		do {
		System.out.println("moi ban chon chuc nang");
		System.out.println("------------------------------------------");
		System.out.println("1.Chuyen Tien");
		System.out.println("2.Rut Tien");
		System.out.println("3.Truy van so du");
		System.out.println("4.Thanh Toan Hoa Don");
		System.out.println("5.Thoat");
		Scanner scanner = new Scanner(System.in);
		nhap = scanner.nextInt();
		ATM(nhap);
		} while (nhap != 5);
	
		
		
//	String hoten = nhapTen();
//	System.out.println("Ten cua ban la: " + hoten);
//	}
//	public static String nhapTen() {
//	Scanner scanner = new Scanner(System.in);
//	System.out.println("moi ban nhap vao ten:");
//	String hoten = scanner.nextLine();
//	return hoten;
	}
	
//		public static void hienThiten() {
//			System.out.println("toi la ai, day la dau");
	

	public static void ATM (int nhap) {
		switch (nhap) {
		case 1:System.out.println("Ban vua nhap vao chuc nang Chuyen Tien");
		break;
		case 2:System.out.println("Ban vua nhap vao chuc nang Rut Tien");
		break;
		case 3:System.out.println("Ban vua nhap vao chuc nang Truy Van So Du");
		break;
		case 4:System.out.println("Ban vua nhap vao chuc nang Thanh Toan Hoa Don");
		break;
		case 5:System.out.println("Xin Chao Va Hen Gap Lai");
		break;
		default: {
			System.out.println("Moi Ban NHap Vao tu 1 Den 4");
		}
		}
		
	}	
	


}
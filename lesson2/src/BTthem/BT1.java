package BTthem;

import java.util.Scanner;

public class BT1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Moi ban nhap vao chieu dai");
		int cd = scanner.nextInt();
		System.out.println("Moi ban nhap vao chieu rong");
		int cr = scanner.nextInt();
		int ChuVi = cvhcn(cr,cd);
		System.out.println("Dien tich hinh chu nhat co chieu dai: " + cd + "cm" + " chieu rong " + cr + "cm la " + ChuVi );
		

}
	public static int cvhcn (int cr, int cd) {
		int ChuVi = (cr + cd)*2;
		return ChuVi;
	}
}



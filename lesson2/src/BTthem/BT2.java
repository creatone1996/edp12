package BTthem;

import java.util.Scanner;

public class BT2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
System.out.println("Moi ban nhap vao canh");
int ca = scanner.nextInt();
int Dientich = DTHV(ca);
System.out.println("Dien tich hinh vuong co canh " + ca + "cm la: " + Dientich);
	}
public static int DTHV (int ca) {
	int Dientich = ca*ca;
	return Dientich;
}


}

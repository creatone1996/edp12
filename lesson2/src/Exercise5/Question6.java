package Exercise5;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner de = new Scanner(System.in);
		System.out.println("Moi Ban Nhap Vao Ten Phong Ban");
		
		Department department = new Department();
		System.out.println("Moi ban nhap vao ID Phong Ban");
		department.id = de.nextInt();
		System.out.println("Moi ban nhap vao Ten Phong Ban");
		department.departmentName = de.next();
		System.out.println("Thong Tin Cua Phong Ban:");
	
		System.out.println("ID: " + department.id);
		System.out.println("Ten Phong Ban: " + department.departmentName);
	}

}

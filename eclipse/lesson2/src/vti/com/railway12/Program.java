//package vti.com.railway12;
//
//
//import java.time.format.DateTimeFormatter;
//import java.util.Date;
//import java.util.Random;
//import java.util.Scanner;
//
//import javax.swing.text.DateFormatter;
//
//
//
//public class Program {
//
//	public static void main(String[] args) {
//		
//		// TODO Auto-generated method stub
////		for(int i = 0; i < 20; i++)
//			//if (i%2 == 5) 
//			//	continue;
//
////	LocalDate localDate = LocalDate.now();
////	DateTimeFormatter dateFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
////	System.out.println(localDate.format(dateFormatter)); // 2021-01-04
////	//-------------
////	DateTimeFormatter dateFormatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
////	System.out.println(localDate.format(dateFormatter1)); // 2020/01/04
////	
////	DateTimeFormatter dateFormatter2 = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
////	System.out.println(localDate.format(dateFormatter2)); // 2020/01/04
////		
////	DateTimeFormatter dateFormatter3 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
////	System.out.println(localDate.format(dateFormatter3)); // 2020/01/04
////		
//		
//		
////	
////	Scanner scanner = new Scanner(System.in);
////	System.out.println(" MOi ban nhap vao ten: ");
////	String hoten = scanner.nextLine();
////	System.out.println(" ten cua ban: " + hoten);
//	
////	Random random = new Random();
////	int a = random.nextInt(10);
////	System.out.println(a);
////	
//
////	Random random = new Random();
////	int minday = (int) LocalDate.of(2010, 1, 1).toEpochDay();
////	int maxday = (int) LocalDate.of(2021, 6, 6).toEpochDay();
////	long randomInt = minday + random.nextInt(maxday - minday);
////	LocalDate randomDay = LocalDate.ofEpochDay(randomInt);
////	System.out.println(randomDay);
//	
//
////	System.out.println(" MOi ban nhap vao mot so: ");
////		int a = scanner.nextInt();
////		System.out.println(" so ban vua nhap: " + a);
//////		for(int i= 20; i >= 0; i-- ) {
//////			System.out.println(i);
//////		}
////		
////		Group group1 = new Group();
////		group1.id = 1;
////		group1.groupName = "nhom 1";
////		
////		Group group2 = new Group();
////		group1.id = 2;
////		group1.groupName = "nhom 2";
////		
////		Group group3 = new Group();
////		group1.id = 3;
////		group1.groupName = "nhom 3";
////		
////		Group[] groups = {group1, group2, group3};
////		
////		for(Group group : groups) { 
////			System.out.println("ID: " + group.id + "Name" + group.groupName)
////		}
////		
////		for (int i = 0; i < groups.length; i++) {
////			System.out.println("ID : " + groups[i].id + "Name" + groups[i].groupName);
////		}
//////		int a = 6;
//////		int b = 2;
//////		int c = 1;
////////		if(a == c) {
////////			System.out.println("bang nhau");
////////		} else if (a<b) {
////////			System.out.println("nho hon");
////////		}
////////		else {
////////			System.out.println("khong bang nhau");
////////		}
//////		
////////		System.out.println(a == b ? "bang nhau" : "khac nhau");
//////		switch (a) {
//////		case 1: 
//////			System.out.println("day la so 1");
//////			break;
//////		case 2: 
//////			System.out.println("day la so 2");
//////			break;
//////		case 3: 
//////			System.out.println("day la so 3");
//////			break;
//////		case 4: 
//////			System.out.println("day la so 4");
//////			break;
//////			
//////		
//////		default:
//////			System.out.println("so nao do");
//////			}
//		
//		
//		
////		Department department1 = new Department();
////		department1.id = 1;
////		department1.departmentName = "MKT";
////		
////		Department department2 = new Department();
////		department2.id = 2;
////		department2.departmentName = "Sales";
////		
////		
////		Department department3 = new Department();
////		department3.id = 3;
////		department3.departmentName = "Test";
//
//		
////		
////		int a = 0;
////		do {
////			System.out.println(a);
////			a++;
////		} while (a < 6);
////		
//		Department department = new Department();
//		department.id = 1;
//		department.departmentName = "Phong Sale";
//		System.out.println("id: " + department.id);
//		System.out.println("departmentName:" + department.departmentName);
//		
//		Department department1 = new Department();
//		department1.id = 2;
//		department1.departmentName = "Phong MKT";
//		System.out.println("id: " + department1.id);
//		System.out.println("departmentName:" + department1.departmentName);
//		
//		Department department3 = new Department();
//		department3.id = 3;
//		department3.departmentName = "Phong Nhan Su";
//		System.out.println("id: " + department3.id);
//		System.out.println("departmentName:" + department3.departmentName);
//		
//		Position position = new Position();
//		position.id = 1;
//		position.PositionName = PositionName.DEV;
//		System.out.println("id: " + position.id);
//		System.out.println("PositionName:" + position.PositionName);
//		
//		Position position1 = new Position();
//		position1.id = 2;
//		position1.PositionName = PositionName.TEST;
//		System.out.println("id: " + position1.id);
//		System.out.println("PositionName:" + position1.PositionName);
//		
//		Position position2 = new Position();
//		position2.id = 3;
//		position2.PositionName = PositionName.PM;
//		System.out.println("id: " + position2.id);
//		System.out.println("PositionName:" + position2.PositionName);
//		
//		Group group1 = new Group();
//		group1.id = 1;
//		group1.groupName = "nhom1";
//		
//		Group group2 = new Group();
//		group2.id = 2;
//		group2.groupName = "nhom2";
//		
//		Group group3 = new Group();
//		group3.id = 3;
//		group3.groupName = "nhom3";
//
//		Account account = new Account();
//		account.id = 1;
//		account.email = "hieupt@vti.com";
//		account.fullName = "Pham Trung Hieu";
//		account.userName = "Hieupt0807";
//		account.department = department;
//		account.position = position;
//		Date date = new Date();
//		account.createDate = date;
//		Group[] accountgroups = {group1, group2};
//		account.groups = accountgroups;
//		
//		System.out.println("ID nhan vien: " + account.id);
//		System.out.println("Email nhan vien: " + account.email);
//		System.out.println("Ten nhan vien: " + account.fullName);
//		System.out.println("Ten dang nhap nhan vien: " + account.userName);
//		System.out.println("Phong Ban Nhan Vien: " + account.department.departmentName);
//		System.out.println("Chuc vu nhan vien: " + account.position.PositionName);
//		System.out.println("Ngay tao Nhan Vien: " + account.createDate);
//		
//		Account account1 = new Account();
//		account1.id = 2;
//		account1.email = "hieup1@vti.com";
//		account1.fullName = "Pham Trung Hieu1";
//		account1.userName = "Hieupt08072";
//		account1.department = department1;
//		account1.position = position1;
//		Date date1 = new Date();
//		account1.createDate = date1;
//		Group [] groupaccount1 = new Group[] {group1, group3};
//		account1.groups =  groupaccount1 ;
//		
//		
//		System.out.println("ID nhan vien: " + account1.id);
//		System.out.println("Email nhan vien: " + account1.email);
//		System.out.println("Ten nhan vien: " + account1.fullName);
//		System.out.println("Ten dang nhap nhan vien: " + account1.userName);
//		System.out.println("Phong Ban Nhan Vien: " + account1.department.departmentName);
//		System.out.println("Chuc vu nhan vien: " + account1.position.PositionName);
//		System.out.println("Ngay tao Nhan Vien: " + account1.createDate);
//		
//		Account account2 = new Account();
//		account2.id = 3;
//		account2.email = "hieup2@vti.com";
//		account2.fullName = "Pham Trung Hieu2";
//		account2.userName = "Hieupt08071";
//		account2.department = department3;
//		account2.position = position2;
//		Date date2 = new Date();
//		account2.createDate = date2;
//		account2.groups = new Group[] {group1, group2, group3};
//		
//		System.out.println("ID nhan vien: " + account2.id);
//		System.out.println("Email nhan vien: " + account2.email);
//		System.out.println("Ten nhan vien: " + account2.fullName);
//		System.out.println("Ten dang nhap nhan vien: " + account2.userName);
//		System.out.println("Phong Ban Nhan Vien: " + account2.department.departmentName);
//		System.out.println("Chuc vu nhan vien: " + account2.position.PositionName);
//		System.out.println("Ngay tao Nhan Vien: " + account2.createDate);
//			
//		
//			
//		System.out.println("kiem tra nhan vien thu 2");
//		if( account1.department == null) {
//			System.out.println("nhan vien nay chua co phong ban");
//		} else {
//			System.out.println("phong ban cua nhan vien nay la: " + account1.department.departmentName);
//		}
//			
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//	}
//}
//
//		

package vti.com.railway12;

import java.util.Date;

public class Lesson2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Department department0 = new Department();
		department0.id = 1;
		department0.departmentName = "Phong Sale";
		System.out.println("id: " + department0.id);
		System.out.println("departmentName:" + department0.departmentName);
		
		Department department1 = new Department();
		department1.id = 2;
		department1.departmentName = "Phong MKT";
		System.out.println("id: " + department1.id);
		System.out.println("departmentName:" + department1.departmentName);
		
		Department department3 = new Department();
		department3.id = 3;
		department3.departmentName = "Phong Nhan Su";
		System.out.println("id: " + department3.id);
		System.out.println("departmentName:" + department3.departmentName);
		
		Position position = new Position();
		position.id = 1;
		position.PositionName = PositionName.DEV;
		System.out.println("id: " + position.id);
		System.out.println("PositionName:" + position.PositionName);
		
		Position position1 = new Position();
		position1.id = 2;
		position1.PositionName = PositionName.TEST;
		System.out.println("id: " + position1.id);
		System.out.println("PositionName:" + position1.PositionName);
		
		Position position2 = new Position();
		position2.id = 3;
		position2.PositionName = PositionName.PM;
		System.out.println("id: " + position2.id);
		System.out.println("PositionName:" + position2.PositionName);
		
		Group group1 = new Group();
		group1.id = 1;
		group1.groupName = "nhom1";
		
		Group group2 = new Group();
		group2.id = 2;
		group2.groupName = "nhom2";
		
		Group group3 = new Group();
		group3.id = 3;
		group3.groupName = "nhom3";

		Account account0 = new Account();
		account0.id = 1;
		account0.email = "hieupt@vti.com";
		account0.fullName = "Pham Trung Hieu";
		account0.userName = "Hieupt0807";
		account0.department = department0;
		account0.position = position;
		Date date = new Date();
		account0.createDate = date;
		Group[] accountgroups = {group1, group2};
		account0.groups = accountgroups;
		
		System.out.println("ID nhan vien: " + account0.id);
		System.out.println("Email nhan vien: " + account0.email);
		System.out.println("Ten nhan vien: " + account0.fullName);
		System.out.println("Ten dang nhap nhan vien: " + account0.userName);
		System.out.println("Phong Ban Nhan Vien: " + account0.department.departmentName);
		System.out.println("Chuc vu nhan vien: " + account0.position.PositionName);
		System.out.println("Ngay tao Nhan Vien: " + account0.createDate);
		
		Account account1 = new Account();
		account1.id = 2;
		account1.email = "hieup1@vti.com";
		account1.fullName = "Pham Trung Hieu1";
		account1.userName = "Hieupt08072";
		account1.department = department1;
		account1.position = position1;
		Date date1 = new Date();
		account1.createDate = date1;
		Group [] groupaccount1 = new Group[] {group1, group3};
		account1.groups =  groupaccount1 ;
		
		
		System.out.println("ID nhan vien: " + account1.id);
		System.out.println("Email nhan vien: " + account1.email);
		System.out.println("Ten nhan vien: " + account1.fullName);
		System.out.println("Ten dang nhap nhan vien: " + account1.userName);
		System.out.println("Phong Ban Nhan Vien: " + account1.department.departmentName);
		System.out.println("Chuc vu nhan vien: " + account1.position.PositionName);
		System.out.println("Ngay tao Nhan Vien: " + account1.createDate);
		
		Account account2 = new Account();
		account2.id = 3;
		account2.email = "hieup2@vti.com";
		account2.fullName = "Pham Trung Hieu2";
		account2.userName = "Hieupt08071";
		account2.department = department3;
		account2.position = position2;
		Date date2 = new Date();
		account2.createDate = date2;
		account2.groups = new Group[] {group1, group2, group3};
		
		System.out.println("ID nhan vien: " + account2.id);
		System.out.println("Email nhan vien: " + account2.email);
		System.out.println("Ten nhan vien: " + account2.fullName);
		System.out.println("Ten dang nhap nhan vien: " + account2.userName);
		System.out.println("Phong Ban Nhan Vien: " + account2.department.departmentName);
		System.out.println("Chuc vu nhan vien: " + account2.position.PositionName);
		System.out.println("Ngay tao Nhan Vien: " + account2.createDate);
			
		group1.accounts = new Account [] {account0, account1, account2};
		group2.accounts = new Account [] {account0, account2};
		group3.accounts = new Account [] {account1, account2};
			
		System.out.println("kiem tra nhan vien thu 2");
		if( account1.department == null) {
			System.out.println("nhan vien nay chua co phong ban");
		} else {
			System.out.println("phong ban cua nhan vien nay la: " + account1.department.departmentName);
		};
		
		
		System.out.println("kiem tra nhan vien thu 2");
		if( account1.groups == null) {
			System.out.println("nhan vien nay chua co nhom");
		} else {
			int countgroups = account1.groups.length;
			if (countgroups == 1 || countgroups == 2) {
				System.out.println("Group cua nhan vien nay la Java\r\n" + "Fresher, C# Fresher");
			}
		
			if (countgroups == 3) {
				System.out.println("nhan vien nay la nguoi quan trong, tham gia nhieu group");
		}
			if (countgroups  >= 4) {
				System.out.println("Nhan vien nay la nguoi hong chuyen, tham gia tat ca group");
		}
		};
		
		System.out.println("kiem tra nhan vien thu 2 (cau 3)");
		System.out.println(account2.department == null ? "Nhan vien nay chua co phong ban" : "Phong ban cua nhan vien nay la: " +
				account2.department.departmentName);
		
		
		System.out.println("kiem tra nhan vien thu 1 (cau 4)");
		
		System.out.println(account0.position.PositionName.toString() == "DEV" ? "Day la Deverloper" : "Nguoi nay khong phai developer");
		
		
		System.out.println("cau 5");
		 int countgroupaccount1 = group1.accounts.length;
		 switch (countgroupaccount1) {
		case 1: 
			System.out.println("nhom co 1 thanh vien");
			break;
		case 2: 
			System.out.println("nhom co 2 thanh vien");
			break;
		case 3: 
			System.out.println("nhom co 3 thanh vien");
			break;
	
		default:
			System.out.println("nhom co nhieu thanh vien");
		};
		
		
		System.out.println("cau 6");
		 int countgroupaccount2 = account2.groups.length;
		 switch (countgroupaccount2) {
		case 1: 
			System.out.println("Group cua nhan vien nay la Java\\r\\n\" + \"Fresher, C# Fresher");
			break;
		case 2: 
			System.out.println("Group cua nhan vien nay la Java\\r\\n\" + \"Fresher, C# Fresher");
			break;
		case 3: 
			System.out.println("nhan vien nay la nguoi quan trong, tham gia nhieu group");
			break;
	
		default:
			System.out.println("Nhan vien nay la nguoi hong chuyen, tham gia tat ca group");
		};
		
		
		

		System.out.println("cau 7");
		 String account1Name = account0.position.PositionName.toString();
		 switch (account1Name) {
		case  "DEV": 
			System.out.println("Nhan vien nay la developer");
			break;
		default:
			System.out.println("nhan vien nay khong phai developer");
		};
		
		
		System.out.println("cau 8");
		Account[] acccounts1 = { account0,account1, account2 };
		for (Account account : acccounts1) {
		System.out.println("AccountID: " + account.id + " Email: " + account.email + " Name: " + account.fullName);
		};
		
		
		System.out.println("cau 9");
		Department[] departmentArray = { department0, department1, department3 };
		for ( Department department : departmentArray) {
		System.out.println("DepartmentID: " + department.id +  " Name: " + department.departmentName);
		};
		
		
		
		System.out.println("cau 10");
				Account[] accArray1 = { account0, account1 };
				for (int i = 0 ; i < accArray1.length; i ++) {
				System.out.println("Th?ng tin account " + (i+1));
				System.out.println("Email: " + accArray1[i].email);
				System.out.println("Full name: " + accArray1[i].fullName);
				System.out.println("Ph?ng ban: " + accArray1[i].department.departmentName);
				};
				
				
		System.out.println("cau 11");
				Department[] departmentArray1 = { department0, department1, department3 };
				for ( int i = 0; i < departmentArray1.length; i++) {
				System.out.println("ID: " + (i+1));
				System.out.println("Name: " + departmentArray1[i].departmentName);
				};
				
				
		System.out.println("cau 12");
				Department[] departmentArray2 = { department0, department1,department3 };
				for ( int i = 0; i < 2; i++) {
					System.out.println("ID: " + (i+1));
					System.out.println("Name: " + departmentArray2[i].departmentName);
				};
		
		
		System.out.println("cau 13");
				Account[] accArray2 = { account0, account1, account2 };
				for (int i = 0 ; i < accArray2.length; i ++) {
					if (i != 1) {				
				System.out.println("Th?ng tin account " + (i+1));
				System.out.println("Email: " + accArray2[i].email);
				System.out.println("Full name: " + accArray2[i].fullName);
				System.out.println("Ph?ng ban: " + accArray2[i].department.departmentName);
					}
				};
				
		System.out.println("cau 14");
				Account[] accArray3 = { account0, account1, account2 };
				for (int i = 0 ; i < accArray2.length; i ++) {
					if (accArray3[i].id < 4) {				
				System.out.println("Th?ng tin account " + (i+1));
				System.out.println("Email: " + accArray3[i].email);
				System.out.println("Full name: " + accArray3[i].fullName);
				System.out.println("Ph?ng ban: " + accArray3[i].department.departmentName);
					}
				};
		
		System.out.println("cau 15");
		for (int i = 0; i <= 20; i++) {
			if (i%2 == 0) {
				System.out.println(i);
			}
		}
		
		
		System.out.println("cau 16");
		Account[] accArray4 = { account0, account1, account2 };
		{
		int i = 0;
		while (i < accArray4.length) {
			System.out.println("Th?ng tin account " + (i+1));
			System.out.println("Email: " + accArray4[i].email);
			System.out.println("Full name: " + accArray4[i].fullName);
			System.out.println("Ph?ng ban: " + accArray4[i].department.departmentName);
			i++;
		}
		};
		
		System.out.println("cau 17");
		Department[] departmentArray3 = { department0, department1, department3 };
		{
		int j = 0;
		while ( j < departmentArray3.length) {
		System.out.println("ID: " + (j+1));
		System.out.println("Name: " + departmentArray3[j].departmentName);
		j++;
		}
		};
		
		System.out.println("cau 18");
		Department[] departmentArray4 = { department0, department1, department3 };
		{
		int j = 0;
		while ( j < departmentArray4.length) {
			if (j < 2) {
		System.out.println("ID: " + (j+1));
		System.out.println("Name: " + departmentArray3[j].departmentName);
		j++;}
		}
		};
		
//		System.out.println("cau 19");
//		Account[] accArray5 = { account0, account1, account2};
//		
//		int i = 0;
//		while (i < accArray5.length)	 {
//			if (i != 1 ) {
//		System.out.println("Th?ng tin account " + (i+1));
//		System.out.println("Email: " + accArray5[i].email);
//		System.out.println("Full name: " + accArray5[i].fullName);
//		System.out.println("Ph?ng ban: " + accArray5[i].department.departmentName);
//			}
//		i++;
//		};
//		
//		System.out.println("cau 20");
//		Account[] accArray6 = { account0, account1, account2 };
//		
//			int i1 = 0;
//			while ( i1 < accArray6.length ) {
//			if (accArray6[i1].id < 4) {				
//		System.out.println("Th?ng tin account " + (i1+1));
//		System.out.println("Email: " + accArray6[i1].email);
//		System.out.println("Full name: " + accArray6[i1].fullName);
//		System.out.println("Ph?ng ban: " + accArray6[i1].department.departmentName);
//			}
//		i1++;
//		};
		
		

//		System.out.println("cau 21");
//		Account[] accArray9 = { account0, account1, account2 };
//		int i2 = 0;
//		do {
//			System.out.println("Th?ng tin account " + (i2+1));
//			System.out.println("Email: " + accArray9[i2].email);
//			System.out.println("Full name: " + accArray9[i2].fullName);
//			System.out.println("Ph?ng ban: " + accArray9[i2].department.departmentName);
//			i2++;
//		} while ( i2 < accArray9.length);
//		
//		
//		System.out.println("cau 22");
//		Department[] departmentArray5 = { department0, department1, department3 };
//		int j = 0;
//		do {
//		System.out.println("ID: " + (j+1));
//		System.out.println("Name: " + departmentArray5[j].departmentName);
//		j++;
//		} while ( j < departmentArray5.length);
//		
//		System.out.println("cau 23");
//		Department[] departmentArray6 = { department0, department1, department3 };
//		int j1 = 0;
//		do {
//			if (j1 < 2) {
//		System.out.println("ID: " + (j1+1));
//		System.out.println("Name: " + departmentArray6[j1].departmentName);
//		j1++;
//		}
//		} while ( j1 < departmentArray6.length);
		
		
//		System.out.println("cau 24");
//		Account[] accArray7 = { account0, account1, account2};
//		
//		int i3 = 0;
//		do {
//			if (i3 != 1 ) {
//		System.out.println("Th?ng tin account " + (i3+1));
//		System.out.println("Email: " + accArray7[i3].email);
//		System.out.println("Full name: " + accArray7[i3].fullName);
//		System.out.println("Ph?ng ban: " + accArray7[i3].department.departmentName);
//			}
//		i3++;
//		} while (i3 < accArray7.length);
//		
//		System.out.println("cau 25");
//		Account[] accArray8 = { account0, account1, account2 };
//		
//			int i4 = 0;
//			do {
//			if (accArray8[i4].id < 4) {				
//		System.out.println("Th?ng tin account " + (i4+1));
//		System.out.println("Email: " + accArray8[i4].email);
//		System.out.println("Full name: " + accArray8[i4].fullName);
//		System.out.println("Ph?ng ban: " + accArray8[i4].department.departmentName);
//			}
//		i4++;
//		} while ( i4 < accArray8.length );
		
		
		System.out.println("QUESTION 1");
		
		System.out.println(" cau 1");
		int i = 5;
		System.out.println(i);
		
		
		
		
			
	}

}

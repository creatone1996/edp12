package hieu2;

import java.time.LocalDateTime;
import java.util.Date;

public class Hieu2 {

	public static void main(String[] args) {
		Department department = new Department();
		department.id = 1;
		department.departmentName = "Phong Sale";
		System.out.println("id: " + department.id);
		System.out.println("departmentName:" + department.departmentName);
		
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
		
		Group group1 = new Group();
		group1.id = 1;
		group1.groupName = "nhom1";
		
		Group group2 = new Group();
		group2.id = 2;
		group2.groupName = "nhom2";
		
		Group group3 = new Group();
		group3.id = 3;
		group3.groupName = "nhom3";
	
		Account account = new Account();
		account.id = 5;
		account.email = "hieupt@vti.com";
		account.fullName = "Pham Trung Hieu";
		account.userName = "Hieupt0807";
		account.department = department;
		account.position = position;
		Date date = new Date();
		account.createDate = date;
		Group[] dsNhom = {group1, group2, group3};
		account.dsNhom = dsNhom;
		
		System.out.println("ID nhan vien: " + account.id);
		System.out.println("Email nhan vien: " + account.email);
		System.out.println("Ten nhan vien: " + account.fullName);
		System.out.println("Ten dang nhap nhan vien: " + account.userName);
		System.out.println("Phong Ban Nhan Vien: " + account.department.departmentName);
		System.out.println("Chuc vu nhan vien: " + account.position.PositionName);
		System.out.println("Ngay tao Nhan Vien: " + account.createDate);
		
		TypeQuestion typeQuestion = new TypeQuestion();
		typeQuestion.id = 1;
		typeQuestion.typeName = TypeName.ESSAY;
		System.out.println("Dinh danh loai cau hoi la :" + typeQuestion.id);
		System.out.println("Ten loai cau hoi: " + typeQuestion.typeName);
		
		
		
		CategoryQuestion categoryQuestion = new CategoryQuestion();
		categoryQuestion.id = 1;
		categoryQuestion.categoryName = CategoryName.NET;
		
		System.out.println("Dinh danh chu de cua cau hoi :" + categoryQuestion.id);
		System.out.println("Ten cua chu de: " + categoryQuestion.categoryName );
		
	
		
		Exam exam1 = new Exam();
		exam1.id = 1;
		exam1.tiTle = "Bai thi 1";
		
		Exam exam2 = new Exam();
		exam2.id = 2;
		exam2.tiTle = "Bai thi 2";
		
		
		Exam exam3= new Exam();
		exam3.id = 3;
		exam3.tiTle = "Bai thi 3";
		
		
		Question question = new Question();
		question.id = 1;
		question.content = "VTI 0003";
		question.categoryQuestion = categoryQuestion;
		question.typeQuestion = typeQuestion;
		question.account = account;
		Exam[] exam = {exam1, exam2,exam3};
		question.exam = exam;
		
		
		System.out.println("dinh danh cua cau hoi: " + question.id);
		System.out.println("noi dung cau hoi: " + question.content);
		System.out.println("dinh danh chu de cau hoi :" + question.categoryQuestion.categoryName);
		System.out.println("dinh danh loai  cau hoi :" + question.typeQuestion.typeName);
		System.out.println("nguoi tao cau hoi :" + question.account.fullName);
		System.out.println("ten cua de thi :" + exam3.tiTle);
	
		
		
		Answer answer = new Answer();
		answer.id = 1;
		answer.conTent = "VTI 0012";
		answer.question = question;
		answer.isCorrect = true;
		
		
		System.out.println("dinh danh cua cau tra loi: " + answer.id);
		System.out.println("noi dung cua cau tra loi : " + answer.conTent);
		System.out.println("noi dung cau hoi: " + answer.question);
		System.out.println("Dung hay Sai: " + answer.isCorrect);

		
		
		Exam exami = new Exam();
		exami.id = 1;
		exami.code = "DT 001";
		exami.tiTle = "CODE NET VTI 0001";
		exami.categoryQuestion = categoryQuestion;
		exami.account = account;
		
		System.out.println("dinh danh cua cau bai thi: " + exami.id);
		System.out.println("ma de thi : " + exami.code);
		System.out.println("tieu de de thi: " + exami.tiTle);
		System.out.println("dinh danh de thi: " + exami.categoryQuestion.categoryName);
		System.out.println("nguoi tao de thi: " + exami.account.fullName);
		
		
		
		
		
		
		
		
		
//		// TODO Auto-generated method stub
//		int a = 1;
//		int b = 5;
//		String hoten = "Pham Trung Hieu";
//		int[] mangso = { 1, 2, 3 };
//		for (int i = 0; i < mangso.length; i++)
//
////System.out.println("hello world");
////System.out.println("Ten toi la: " + "Pham Trung Hieu");
////System.out.println("tong cua " + a + " va " + b + " la:" + ( a + b ));
//		{
//			System.out.println(" so thu " + i + " la: " + mangso[i]);
//		}
	}

}

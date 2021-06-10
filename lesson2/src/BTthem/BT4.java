package BTthem;

import java.util.Scanner;

public class BT4 {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("moi ban nhap vao so so nguyen duong: "); 
	    int n = scanner.nextInt();
	    int soDu, tong = 0;
	    
	         
	    
	  
	         
	    while (n > 0) {
	        soDu = n % 10;
	        n = n / 10;
	        tong += soDu;
	    }
	         
	    System.out.println("tong cac chu so = " + tong);
	}
}	



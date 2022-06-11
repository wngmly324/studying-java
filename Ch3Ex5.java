package java_exam.ch3;

import java.util.Scanner;

public class Ch3Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String password = scan.next();
		int ipassword = Integer.parseInt(password);
		
		int res = ipassword << 2;
		
		System.out.println(res);
		
	}

}
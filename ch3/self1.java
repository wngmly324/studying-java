package javabook.ch3;

import java.util.Scanner;

public class self1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		
		Scanner scan = new Scanner(System.in);
		String sel = scan.next();
		
		num = Integer.parseInt(sel);
		
		if(num % 2 == 0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}

	}

}

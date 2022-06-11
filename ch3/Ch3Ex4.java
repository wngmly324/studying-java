package java_exam.ch3;

import java.util.Scanner;

public class Ch3Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("annual income: ");
		String in = scan.next();
		
		System.out.print("credit rating: ");
		char ra = scan.next().charAt(0);
		
		System.out.print("existing customer: ");
		String cu = scan.next();
		
		String res1;
		
		if(Integer.parseInt(in) >= 5000 || (int)ra >= 98) {
			res1 = "o";
		}
		else {
			res1 = "x";
		}

		if(res1.equals("o")) {
			if(cu.equals("y")) {
				System.out.println("make card ok");
			}
			else {
				System.out.println("make card no");
			}
		}
		else {
			System.out.println("make card no");
		}
		

	}

}

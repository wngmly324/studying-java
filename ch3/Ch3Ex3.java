package java_exam.ch3;

import java.util.Scanner;

public class Ch3Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int haveMoney = 10000;
		boolean ox = true;
		
		while(ox) {
			System.out.print("Amound used: ");
			String charge = scan.next();
			
			haveMoney -= Integer.parseInt(charge);
			
			if(haveMoney <= 0) {
				ox = false;
				System.out.println("Out of balance. You can't use the card.");
			}
		}

	}

}

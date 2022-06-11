package java_exam.ch3;

import java.util.Scanner;

public class Ch3Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		boolean ox = true;
		int sum = 0;
		
		while(ox) {
			String price = scan.next();
			
			if(price.equals("q")) {
				ox = false;
				System.out.printf("%d", sum);
			}
			else {
				sum += Integer.parseInt(price);
			}
		}

	}

}

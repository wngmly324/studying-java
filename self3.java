package javabook.ch3;

import java.util.Scanner;

public class self3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String code = "1234";
		boolean ox = true;
		int count = 0;
		
		while(ox) {
			count++;
			System.out.printf("count: %d\n", count);
			System.out.print("# enter the code: ");
			String in = scan.next();
			
			if(in.equals(code)) {
				ox = false;
				System.out.println("You escaped from the room.");
			}
			
			if(count >= 3) {
				ox = false;
				System.out.println("You have eceeded the number of times.");
			}
		}
	}

}

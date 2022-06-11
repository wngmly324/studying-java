package java_exam.ch3;

import java.util.Scanner;

public class Ch3Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] com = {1,2,3,3,2}; //1:가위, 2:바위, 3:보
		
		Scanner scan = new Scanner(System.in);
		
		int game = 5;
		int count = 0;
		int winCom = 0;
		int winMe = 0;
		
		for(int i = 0; i < com.length; i++) {
			count ++;
			System.out.printf("%d/%d: ", count, game);
			String me = scan.next();
			int ime = Integer.parseInt(me);
			
			if(com[i] == 1) {
				if(ime == 1) {
					System.out.println("draw!!");
				}
				else if(ime == 2) {
					System.out.println("my win!!");
					winMe += 1;
				}
				else {
					System.out.println("com win!!");
					winCom += 1;
				}
			}
			else if(com[i] == 2) {
				if(ime == 2) {
					System.out.println("draw!!");
				}
				else if(ime == 3) {
					System.out.println("my win!!");
					winMe += 1;
				}
				else {
					System.out.println("com win!!");
					winCom += 1;
				}
			}
			else {
				if(ime == 3) {
					System.out.println("draw!!");
				}
				else if(ime == 1) {
					System.out.println("my win!!");
					winMe += 1;
				}
				else {
					System.out.println("com win!!");
					winCom += 1;
				}
			}
			
		}
		
		if(winMe > winCom) {
			System.out.println("End Game - Winner is me.");
		}
		else if(winMe < winCom) {
			System.out.println("End Game - Winner is Computer.");
		}
		else {
			System.out.println("End Game - Draw.");
		}
		
	}
}

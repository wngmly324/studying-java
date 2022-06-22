
public class LoopArray {

	public static void main(String[] args) {
		
		/*
		 * <li>egoing</li>
		 * <li>jinhuck</li>
		 * <li>youbin</li>
		 */
		
		String[] users = new String[3];
		users[0] = "egoing";
		users[1] = "jinhuck";
		users[2] = "youbin";
		
		for(int i = 0; i < users.length; i++) {
//			System.out.println("<li>" + users[i] + "</li>");
//			System.out.println(users[i] + ",");
			if(users[i].equals(users[users.length - 1])) {
				System.out.println(users[i]);
			} else {
				System.out.println(users[i] + ",");
			}
		}
	
	}

}

/*
 * 출처
 * 생활코딩, "JAVA 제어문 - 7.3. 반복문 + 배열", https://www.youtube.com/watch?v=tLLv1Ui39R0
 */
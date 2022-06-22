
public class AuthApp3 {

	public static void main(String[] args) {
		
//		String[] users = {"egoing", "jinhuck", "youbin"};
		String[][] users = {
				{"egoing", "1111"},
				{"jinhuck", "2222"},
				{"youbin", "3333"}
		};
		
		String inputId = args[0];
		String inputPass = args[1];
		
		boolean isLogined = false;
		for(int i = 0; i < users.length; i++) {
			String[] currentId = users[i];
			if(currentId[0].equals(inputId) && currentId[1].equals(inputPass)) {
				isLogined = true;
				break;
			}
		}
		
		System.out.println("Hi,");;
		if(isLogined) {
			System.out.println("Master!!");
		} else {
			System.out.println("Who are you?");
		}

	}

}

/*
 * 출처
 * 생활코딩, "JAVA 제어문 - 8.1. 종합응용 1", https://www.youtube.com/watch?v=4B-Iup2UEWM
 * 생활코딩, "JAVA 제어문 - 8.2. 종합응용 2과 수업을 마치며", https://www.youtube.com/watch?v=aTdK2I6xiR0
 */
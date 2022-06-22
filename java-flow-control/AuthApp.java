
public class AuthApp {

	public static void main(String[] args) {
		
		String id = "egoing";
		String inputId = args[0];
		
		String pass = "1111";
		String inputPass = args[1];
		
		System.out.println("Hi.");
		
//		if(inputId == id) {
//		if(inputId.equals(id)) {
//			if(inputPass.equals(pass)) {
//				System.out.println("Master!");
//			} else {
//				System.out.println("Wrong password!");
//			}
//		} else {
//			System.out.println("Who are you?");
//		}
		
		if(inputId.equals(id) && inputPass.equals(pass)) {
			System.out.println("Master!");
		} else {
			System.out.println("Who are you?");
		}

	}

}

/*
 * 출처
 * 생활코딩, "JAVA 제어문 - 4.2. 조건문 응용", https://www.youtube.com/watch?v=tjVzNd8GzMo
 * 생활코딩, "JAVA 제어문 - 4.3. 조건문 응용", https://www.youtube.com/watch?v=gzpYcFkcnSY
 */
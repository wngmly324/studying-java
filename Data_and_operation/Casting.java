
public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1;
		double b2 = (double) 1;
		System.out.println(b);
		
//		int c = 1.1;
		double d = 1.1;
		int e = (int) 1.1;
		System.out.println(e);
		
		// 1 to String
		String f = Integer.toString(1);
		System.out.println(f.getClass());

	}

}

/*
 * 출처
 * 생활코딩, "JAVA1 - 8.2. JAVA1 - 8.3. 데이터 타입의 변환 (casting)", https://www.youtube.com/watch?v=LeTbH63CpRo&t=15s
 */
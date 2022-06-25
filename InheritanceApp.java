class Cal {
	int v1, v2;
	Cal(int v1, int v2) {
		System.out.println("Cal init!!");
		this.v1 = v1;
		this.v2 = v2;
	}
	public int sum() {
		return this.v1+v2;
	}
//    public int sum(int v1, int v2){
//        return v1+v2;
//    }
//    // Overloading
//    public int sum(int v1, int v2, int v3){
//        return this.sum(v1,v2)+v3;
//    }
}
class Cal3 extends Cal {
	Cal3(int v1, int v2) {
		super(v1, v2);
		System.out.println("Cal3 init!!");
	}
	public int minus() {
		return this.v1-v2;
	}
//	public int minus(int v1, int v2) {
//		return v1 - v2;
//	}
//	// Overriding
//	public int sum(int v1, int v2) {
//		System.out.println("Cal3!!");
//		// 부모 클래스인 Cal의 sum을 가리키게 됨
//		return super.sum(v1, v2);
//	}
}

public class InheritanceApp {

	public static void main(String[] args) {
		
		Cal c = new Cal(2, 1);
		Cal3 c3 = new Cal3(2, 1);
		System.out.println(c3.sum()); // 3
		System.out.println(c3.minus()); // 1
		
//		Cal c = new Cal();
//		System.out.println(c.sum(2,1));
//		System.out.println(c.sum(2,1,1));
//		
//		Cal3 c3 = new Cal3();
//		System.out.println(c3.sum(2,1));
//		System.out.println(c3.minus(2,1));
//		System.out.println(c3.sum(2,1));

	}

}

//class Cal2 {
//	public int sum(int v1, int v2) {
//		return v1 + v2;
//	}
//	public int minus(int v1, int v2) {
//		return v1 - v2;
//	}
//}

/*
 * 출처
 * 생활코딩, "Java 상속 - 1. 수업소개", https://www.youtube.com/watch?v=tsgJEm-pq2E&t=406s
 * 생활코딩, "JAVA 상속 - 2. 기능의 개선과 발전", https://www.youtube.com/watch?v=htkZUEzsUuM
 * 생활코딩, "Java 상속 - 3. Overriding vs Overloading", https://www.youtube.com/watch?v=RvZ5yJvaUAc
 * 생활코딩, "Java 상속 - 4. this & super", https://www.youtube.com/watch?v=3S4Tbz5H-H0
 * 생활코딩, "Java 상속 - 5. 상속과 생성자", https://www.youtube.com/watch?v=OStTXyl636k&t=1s
 */
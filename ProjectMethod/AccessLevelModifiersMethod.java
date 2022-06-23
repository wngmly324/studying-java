class Greeting {
	// public, protected, default, private
	public static void hi() {
		System.out.println("Hi");
	}
	
	//public: 클래스 바깥 쪽에서 사용 가능
	// private: 같은 클래스 안 쪽에서만 사용 가능

}
public class AccessLevelModifiersMethod {
	
	public static void main(String[] args) {

		Greeting.hi();

	}

}

/*
 * 출처
 * 생활코딩, "JAVA method - 8. 부록 - access level modifiers", https://www.youtube.com/watch?v=WfF-U4jGZL4&t=55s
 */
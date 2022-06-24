
class Print {
	// static은 클래스의 소속
	
	public String delimiter = "";
	
	// 생성자, 클래스의 이름과 똑같은 메소드를 정의, static이나 return 등을 지정하지 않음
	// 생성자는 초기에 주입할 필요가 있는 값을 전달하거나 초기의 작업을 수행하도록 할 때 쓴다.
	// this라는 특수한 키워드는 그 클래스가 인스턴스화되었을 때 인스턴스를 가리키는 특수한 이름이다.
	public Print(String delimiter) {
		// this.delimiter는 인스턴스의 delimiter 변수니까 5번째 라인의 delimiter을 가리키게 됨
		this.delimiter = delimiter;
	}

	public void A() {
		System.out.println(this.delimiter);
		System.out.println("A");
		System.out.println("A");
	}
	public void B() {
		System.out.println(this.delimiter);
		System.out.println("B");
		System.out.println("B");
	}
}

/*
 * 출처
 * 생활코딩, "JAVA 객체 지향 프로그래밍 - 4.2. 클래스 - 형식", https://www.youtube.com/watch?v=jpcXlhgEzmQ
 * 생활코딩, "JAVA 객체 지향 프로그래밍 - 5. 인스턴스", https://www.youtube.com/watch?v=Y370ydbIb7Y
 */
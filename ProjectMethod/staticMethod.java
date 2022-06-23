
class Print {
	public String delimiter;
	public void a() {
		System.out.println(this.delimiter);
		System.out.println("a");
		System.out.println("a");
	}
	public void b() {
		System.out.println(this.delimiter);
		System.out.println("b");
		System.out.println("b");
		
	}
	public static void c(String delimiter) {
		System.out.println(delimiter);
		System.out.println("c");
		System.out.println("c");
	}
}
public class staticMethod {
	
	public static void main(String[] args) {
		
		// static - class method
		// no static - instance method
		// 메서드가 클래스의 소속일 때는 static이 있어야 됨
		
//		Print.a("-");
//		Print.b("-");
		
		// instance
		Print t1 = new Print();
		t1.delimiter = "-";
		t1.a();
		t1.b();
		
		Print.c("$");
		
//		Print.a("*");
//		Print.b("*");
		
		Print t2 = new Print();
		t2.delimiter = "*";
		t2.a();
		t2.b();

	}

}

/*
 * 출처
 * 생활코딩, "JAVA method - 9. 부록 - static", https://www.youtube.com/watch?v=tcxf9epFD_U&t=4s
 */
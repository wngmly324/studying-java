class Accounting {
	public double valueOfSupply;
	public static double vatRate = 0.1;
	public Accounting(double valueOfSupply) {
		this.valueOfSupply = valueOfSupply;
		
	}
	public double getVAT() {
		return valueOfSupply * vatRate;
	}
	public double getTotal() {
		return valueOfSupply + getVAT();
	}
}

public class AccountingApp {
	
	public static void main(String[] args) {
		
		Accounting a1 = new Accounting(10000.0);
//		a1.valueOfSupply = 10000.0;
		
		Accounting a2 = new Accounting(20000.0);
//		a2.valueOfSupply = 20000.0;
		
		System.out.println("Value of supply : " + a1.valueOfSupply);
		System.out.println("Value of supply : " + a2.valueOfSupply);
		
		System.out.println("VAT : " + a1.getVAT());
		System.out.println("VAT : " + a2.getVAT());
		
		System.out.println("Total : " + a1.getTotal());
		System.out.println("Total : " + a2.getTotal());
		
//		Accounting.valueOfSupply = 10000.0;
//		System.out.println("Value of supply : " + Accounting.valueOfSupply);
//		Accounting.valueOfSupply = 20000.0;
//		System.out.println("Value of supply : " + Accounting.valueOfSupply);
//		
//		Accounting.valueOfSupply = 10000.0;
//		System.out.println("VAT : " + Accounting.getVAT());
//		Accounting.valueOfSupply = 20000.0;
//		System.out.println("VAT : " + Accounting.getVAT());
//		
//		Accounting.valueOfSupply = 10000.0;
//		System.out.println("Total : " + Accounting.getTotal());
//		Accounting.valueOfSupply = 20000.0;
//		System.out.println("Total : " + Accounting.getTotal());
		
	}

}

/*
 * 출처
 * 생활코딩, "JAVA 객체 지향 프로그래밍 - 8 .1. 활용 - 클래스화", https://www.youtube.com/watch?v=siUcCqySsng
 * 생활코딩, "JAVA 객체 지향 프로그래밍 - 8. 2. 활용 - 인스턴스화", https://www.youtube.com/watch?v=1KWFFwtM4Kg
 */
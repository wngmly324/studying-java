
public class AccountingApp {

	public static void main(String[] args) {
		
		double valueOfSupply = Double.parseDouble(args[0]);
		double VATRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply * VATRate;
		double total = valueOfSupply + vat;
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense;
		double diviend1 = income * 0.5;
		double diviend2 = income * 0.3;
		double diviend3 = income * 0.2;
		
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT : " + vat);
		System.out.println("Total : " + total);		
		System.out.println("Expense : " + expense);		
		System.out.println("Income : " + income);		
		System.out.println("Diviend 1 : " + diviend1);		
		System.out.println("Diviend 2 : " + diviend2);		
		System.out.println("Diviend 3 : " + diviend3);
		

	}

}

/*
 * 출처
 * 생활코딩, "JAVA1 - 14.2. 나의 앱 만들기 - 기본 기능 구현", https://www.youtube.com/watch?v=RSTVfycyssA&t=6s
 * 생활코딩, "JAVA1 - 14.3. 나의 앱 만들기 - 변수도입", https://www.youtube.com/watch?v=7Wg74I0QLaE&t=4s
 * 생활코딩, "JAVA1 - 14.4. 나의 앱 만들기 - 입력값 도입", https://www.youtube.com/watch?v=iYPQ20VgQUU&t=3s
 */

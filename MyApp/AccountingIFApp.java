
public class AccountingIFApp {

	public static void main(String[] args) {
		
		double valueOfSupply = Double.parseDouble(args[0]);
		double VATRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply * VATRate;
		double total = valueOfSupply + vat;
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense;
		
		double diviend1;
		double diviend2;
		double diviend3;
		
		if(income > 10000.0) {
			diviend1 = income * 0.5;
			diviend2 = income * 0.3;
			diviend3 = income * 0.2;
		}
		else {
			diviend1 = income * 1;
			diviend2 = income * 0;
			diviend3 = income * 0;
		}
		
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
 * 생활코딩, "JAVA1 - 14.6. 나의 앱 만들기 - 조건문", https://www.youtube.com/watch?v=y-qUWhanlkM
 */

public class AccountingArrayLoopApp {

	public static void main(String[] args) {
		
		double valueOfSupply = Double.parseDouble(args[0]);
		double VATRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply * VATRate;
		double total = valueOfSupply + vat;
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense;
		
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT : " + vat);
		System.out.println("Total : " + total);
		System.out.println("Expense : " + expense);
		System.out.println("Income : " + income);
		
		double[] diviendRates = new double[3];
		diviendRates[0] = 0.5;
		diviendRates[1] = 0.3;
		diviendRates[2] = 0.2;
		
		int i = 0;
		while(i < diviendRates.length) {
			System.out.println("Diviend : " + (income * diviendRates[i]));
			i += 1;
		}
		
	}

}

/*
 * 출처
 * 생활코딩, "JAVA1 - 14.8. 나의 앱 만들기 - 반복문", https://www.youtube.com/watch?v=4-5tmh5Krk8
 */
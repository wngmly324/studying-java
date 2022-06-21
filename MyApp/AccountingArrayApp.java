
public class AccountingArrayApp {

	public static void main(String[] args) {
		
		double valueOfSupply = Double.parseDouble(args[0]);
		double VATRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply * VATRate;
		double total = valueOfSupply + vat;
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense;
		
		double[] diviendRates = new double[3];
		diviendRates[0] = 0.5;
		diviendRates[1] = 0.3;
		diviendRates[2] = 0.2;
		
		double diviend1 = income * diviendRates[0];
		double diviend2 = income * diviendRates[1];
		double diviend3 = income * diviendRates[2];
		
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
 * 생활코딩, "JAVA1 - 14.7. 나의 앱 만들기 - 배열", https://www.youtube.com/watch?v=sMBu20ZZwzE
 */
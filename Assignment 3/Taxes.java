public class Taxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double taxBrack1 = .1, taxBrack2 = .15;
		double taxBrack3 = .25, taxBrack4 = .35;
		double taxOwed = 0;
		double incBrack1 = 8000, incBrack2 = 26000;
		double incBrack3 = 48000, incBrack4 = 82000;
		System.out.print("What is your taxable income in Elbonian dollars: ");
		int income = IO.readInt();
		
		if (income < 0) {
			IO.reportBadInput();
		}
		
		if (income <= incBrack1) {
			taxOwed = income * taxBrack1;
		} 
		
		if (income > incBrack1 && income <= (incBrack1 + incBrack2)) {
			taxOwed = (income - incBrack1) * (taxBrack2);
			taxOwed += (incBrack1) * taxBrack1;
		}
		
		if (income > (incBrack1 + incBrack2) && income <= (incBrack4)) {
			taxOwed  = (income - incBrack2 - incBrack1) * taxBrack3;
			taxOwed += (incBrack2) * taxBrack2;
			taxOwed += (incBrack1) * taxBrack1;
		}
	
		if (income > (incBrack4)) {
			taxOwed  = (income - incBrack3 - incBrack2 - incBrack1) * taxBrack4;
			taxOwed += (incBrack3) * taxBrack3;
			taxOwed += (incBrack2) * taxBrack2;
			taxOwed += (incBrack1) * taxBrack1;
		}
		
		System.out.println(taxOwed);
	}

}

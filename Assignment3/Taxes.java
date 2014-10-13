public class Taxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double taxBrack1 = .1, taxBrack2 = .15;				//the % tax at each bracket
		double taxBrack3 = .25, taxBrack4 = .35;			
		double taxOwed = 0;						//output, taxes owed
		double incBrack1 = 8000, incBrack2 = 26000;			//the four tax brackets as income
		double incBrack3 = 48000, incBrack4 = 82000;			//for additional dollars spent
		System.out.print("What is your taxable income in Elbonian dollars: ");
		int income = IO.readInt();					//input; users income
		
		if (income < 0) {						//income must be greater than 0 to be taxed
			IO.reportBadInput();
		}
		
		if (income <= incBrack1) {					//tax if within first tax bracket
			taxOwed = income * taxBrack1;
		} 
		
		if (income > incBrack1 && income <= (incBrack1 + incBrack2)) {	//tax if within first and second bracket
			taxOwed = (income - incBrack1) * (taxBrack2);
			taxOwed += (incBrack1) * taxBrack1;
		}
		
		if (income > (incBrack1 + incBrack2) && income <= (incBrack4)) { //tax within first, second and third
			taxOwed  = (income - incBrack2 - incBrack1) * taxBrack3;
			taxOwed += (incBrack2) * taxBrack2;
			taxOwed += (incBrack1) * taxBrack1;
		}
	
		if (income > (incBrack4)) {
			taxOwed  = (income - incBrack3 - incBrack2 - incBrack1) * taxBrack4; //tax within all four brackets
			taxOwed += (incBrack3) * taxBrack3;
			taxOwed += (incBrack2) * taxBrack2;
			taxOwed += (incBrack1) * taxBrack1;
		}
		
		System.out.println(taxOwed);					//output of taxes owed
	}

}

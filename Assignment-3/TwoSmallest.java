
public class TwoSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// user inputs terminating value
		// user then inputs subsequent values
		// user inputs terminating value again when out of numbers
		// program outputs the smallest two numbers
		
		double subsValue;					//subsequent value entered by user
				
		System.out.print("Enter the terminating value: ");
		double termin = IO.readDouble();			//terminating value inputted 
			
		if ((subsValue = IO.readDouble()) != termin) {		//checks to see if user re-enters terminating value since no list values is a special case
			double smallest = subsValue;			//smallest value is the only value entered
			double smallest2 = 0;				//smallest 2 initialized
			
			if ((subsValue = IO.readDouble()) != termin) { //checks to see if user re-enters value, since 1 list value is a special case
				
				if (subsValue <= smallest) {		//checks to see if subsequent value is smaller than the smallest number
					smallest2 = smallest;
					smallest = subsValue;
				} else { smallest2 = subsValue;}	//if not, it is the second smallest number
				
				while ((subsValue = IO.readDouble()) != termin) {	//continously prompts user for more numbers
					if (subsValue <= smallest) {
						smallest2 = smallest;
						smallest = subsValue;
					} else if (subsValue >= smallest && subsValue < smallest2) {
						smallest2 = subsValue;
					}
				
			   }
				
			   System.out.println("Result: " + smallest);		//output
			   System.out.println("Result: " + smallest2);
								
		  } else {System.out.println("Only one list number available: " + smallest);}	//outputs one value if only one value is entered
		} else {IO.reportBadInput();}	//outputs bad input if no values exist
			
	}
	
			
	
}		
		

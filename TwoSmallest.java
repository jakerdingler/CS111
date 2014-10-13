
public class TwoSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double subsValue;
				
		System.out.print("Enter the terminating value: ");
		double termin = IO.readDouble();
			
		if ((subsValue = IO.readDouble()) != termin) {
			double smallest = subsValue;
			double smallest2 = 0;
			
			if ((subsValue = IO.readDouble()) != termin) {
				
				if (subsValue <= smallest) {
					smallest2 = smallest;
					smallest = subsValue;
				} else { smallest2 = subsValue;}
				
				while ((subsValue = IO.readDouble()) != termin) {
					if (subsValue <= smallest) {
						smallest2 = smallest;
						smallest = subsValue;
					} else if (subsValue >= smallest && subsValue < smallest2) {
						smallest2 = subsValue;
					}
				
			   }
				
			   System.out.println("Result: " + smallest);
			   System.out.println("Result: " + smallest2);
								
		  } else {System.out.println("Only one list number available: " + smallest);}
		} else {IO.reportBadInput();}
			
	}
	
			
	
}		
		

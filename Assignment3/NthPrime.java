
public class NthPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// This program prompts the user for the nth prime number they would like
	
		int n = IO.readInt();  // The nth prime number the user wants
		int primeCount = 0;    // A counter for the number of prime numbers found
		int nthPrime = 0;     // The prime number currently found
		
	if ( n <= 0) {							//Error check
		IO.reportBadInput();
	}else {								
		for (int i=2; primeCount < n; i++) {			//i goes through number used to check if it is prime
			int count = 0;					//2 is first prime number
					
			for (int num = 1; num < i; num++) {		//checks if number i is a prime number
				if (i % num == 0) {
					count++;			//checks to see if i is divisible by num	
				}
			}
			
			if (count == 1) {				//if count = 1, then the number is only divisble by 1
				primeCount++;				//and is therefore a primenumber
				nthPrime = i;				
			}
		}
		
	 System.out.println(nthPrime);
	}
  }
}

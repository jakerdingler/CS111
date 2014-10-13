
public class NthPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = IO.readInt();
		int primeCount = 0;
		int nthPrime = 0;
		
	if ( n <= 0) {
		IO.reportBadInput();
	}else {
		for (int i=2; primeCount < n; i++) {
			int count = 0;
					
			for (int num = 1; num < i; num++) {
				if (i % num == 0) {
					count++;				
				}
			}
			
			if (count == 1) {
				primeCount++;
				nthPrime = i;
			}
		}
		
	 System.out.println(nthPrime);
	}
  }
}
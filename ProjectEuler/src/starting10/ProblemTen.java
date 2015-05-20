package starting10;

/*Problem 10
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.*/



public class ProblemTen {
	
	//checks whether an int is prime or not.
	boolean isPrime(long n) {
	    //check if n is a multiple of 2
	    if (n%2==0) return false;
	    //if not, then just check the odds
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}

	public static void main(String[] args) {
		
		long total = 2;
		
		ProblemTen f = new ProblemTen();
		
		for(long i = 3; i<2000001; i++){
			
			if(f.isPrime(i)){
				
				total = total+i;
			}
		}
		System.out.println(total);
	}

}

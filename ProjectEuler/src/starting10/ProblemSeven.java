package starting10;

/*By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?*/

public class ProblemSeven {
	
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
		
		ProblemSeven s = new ProblemSeven();
		int count = 10001;
		long result = 0L;
		
		outerloop:
		for(long i = 0; i<1000000000000L; i++){
			if(s.isPrime(i)){
				count--;
			}
			if(count == 0){
				result = i;
				break outerloop;
			}
		}
		
		System.out.println(result);
	}

}

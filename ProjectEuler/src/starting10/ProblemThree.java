package starting10;

/*
 * 
   The prime factors of 13195 are 5, 7, 13 and 29.

   What is the largest prime factor of the number 600851475143 ?
*  
*/
public class ProblemThree {
	
	public static int largestPrimeFactor(long number) { 
		int i; 
		long copyOfInput = number; 
		
		for (i = 2; i <= copyOfInput; i++) { 
			System.out.println(copyOfInput + " " + i);
			
			if (copyOfInput % i == 0) { 
				copyOfInput /= i;
				i--; 
			} 
		} 
		return i;
	}

	

	public static void main(String[] args) {
		
		long number = 600851475143L;
		
		System.out.println(largestPrimeFactor(number));
		
			
		
	}

}

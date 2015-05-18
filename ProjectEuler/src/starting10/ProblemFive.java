package starting10;

/*
 *2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

 
 *What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 *
*/	

public class ProblemFive {
	
	// counts the number of numbers that the entry is evenly divisible by, as max is 20
	 int twentyDivCount(int a){
		
		int count = 0;
		for(int i = 1; i<21; i++){
			
			if( a % i == 0){
				count++;
			} 
			
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		int start = 500000000;
		int result = start;
		
		
		ProblemFive ff = new ProblemFive();
		
		for (int i = start; i > 0; i--){
			
			int temp = ff.twentyDivCount(i);
			
			if(temp == 20){
				result = i;
				System.out.println(result);
			}
		}
		
		System.out.println(result);

	}

}

package starting10;

/*Problem 9
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.

*/

public class ProblemNine {
	
	
	public static void main(String[] args) {
		
		ProblemNine f = new ProblemNine();
		System.out.println(f.tripletP());
		
	}
	
	boolean isTriplet(int a, int b, int c){
		
		if(((Math.pow(a, 2))+(Math.pow(b, 2)))==(Math.pow(c, 2))){
			return true;
		} else return false;	
	}
	
	int tripletP(){
		int a=1,b=2,c=997;
		int product = 0;
		
		//outerloop generates all possible combinations of 3 summators for the number 1000, if b>c>a is true
		outerloop:
		for(int i = 997; i>335; i--){
			c = i;
			b = 999-i;
			a = 1;
						
			while(b>(a+2)){
				b--;
				a++;
				
				if (isTriplet(a,b,c)){
					product=a*b*c;
					break outerloop;
				}
			} 	
			
			
		}
			
		return product;
	}

}

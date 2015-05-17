package starting10;

/*
 * A palindromic number reads the same both ways. 
   The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

   Find the largest palindrome made from the product of two 3-digit numbers.
 */


public class ProblemFour {
	
	static String palindrome(int a, int b){
		
		int mult = a*b;		
		String number = Integer.toString(mult);
		String first = number.substring(0, number.length() / 2);  
		String second = number.substring(number.length() / 2);
		second = new StringBuilder(second).reverse().toString();
		
		
		
		if((first.length() == second.length()) && first.equals(second)){
			return number;
		} else
			
		return "";
	}
	
	public static void main(String[] args) {
		
		String result = "";
		int res = 0;
		
		
		for(int i = 999; i>0; i--){
			
			for(int j = 999; j>0; j--){
				
				if(!palindrome(i,j).equals("")){
					result = palindrome(i,j);
					if(res < Integer.parseInt(result)){
						res = Integer.parseInt(result);
					}
					
				}
			}
		}
		System.out.println(res);

	}

}

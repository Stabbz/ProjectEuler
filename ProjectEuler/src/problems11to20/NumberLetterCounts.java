package problems11to20;

import java.util.LinkedList;

public class NumberLetterCounts {
	/*
	 * Number letter counts
Problem 17
If the numbers 1 to 5 are written out in words: one, two, three, four, five,
 then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?


NOTE: Do not count spaces or hyphens. For example,
 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters.
 The use of "and" when writing out numbers is in compliance with British usage.
	 */

	public static void main(String[] args) {
		
		System.out.println(writeNumToString());
	}

	
	public static int writeNumToString(){
		 int res = 0;
		 int n = 1;
		 
		 
		 /* Number classification
		  * Num of letters - number
			3 - 1,2,6,10, and
			4 - 4,5,9
			5 - 3,7,8,40,50,60
			6 - 11,12,20,30,80,90
			7 - 15,16,70,*00 (hundred)
			8 - 13,14,18,19
			9 - 17
			
		  */
		 while ( n < 1001){
			 
			 if(n == 1000){res = res + 11 ; }
			 if(n == 100 || n == 200 || n == 600){
				 res = res + 10; // one hundred = 10
			 }
			 if(n == 400 || n == 500 || n == 900){
				 res = res + 11;
			 }
			 if(n == 300 || n == 700 || n == 800){
				 res = res + 12;
			 }
			 if((n > 300 && n < 400) || ((n > 700 && n < 900)) && n != 800){ // +15
				 int last = getLastChars(n,2);
				 if((last != 0 && last <= 20) || last == 30 || last == 40 || last == 50 || last == 60 || last == 70 || last == 80 || last == 90){
					 res = 15 + simpleAdditions(last,res);
				 }
				 else {
					 res = 15 + biggerAdditions(last,res);
				 }
			 }
			 if(((n > 100 && n < 300) && n != 200) || (n > 600 && n < 700)){ // one-hundred // two-hundred == 10 : and *  = 13
				 int last = getLastChars(n,2);
				 if((last != 0 && last <= 20) || last == 30 || last == 40 || last == 50 || last == 60 || last == 70 || last == 80 || last == 90){
					 res = 13 + simpleAdditions(last,res);
				 }
				 else
				 {
					 res = 13 + biggerAdditions(last,res);
				 }
			 }
			 
			 if(((n > 400 && n < 600) && (n != 500)) || (n > 900 && n < 1000)){ // +14
				 int last = getLastChars(n,2);
				 if((last != 0 && last <= 20) || last == 30 || last == 40 || last == 50 || last == 60 || last == 70 || last == 80 || last == 90){
					 res = 14 + simpleAdditions(last,res);
				 }
				 else{
					 res = 14 + biggerAdditions(last,res);
				 }
			 }
			 
			res = biggerAdditions(n,res); 		
			res = simpleAdditions(n,res);
			
			
			
			System.out.println("Number: " + n + " , Total: " + res);
			n++;
		 }
		 
		 
		 return res;
	 }
	
	 /* simple number cases */
	 
	 /* for numbers 1-20, 30,40,50,60,70,80,90 */
	 public static int simpleAdditions(int n, int res){
		
		 if(n == 1 || n == 2 || n == 6 || n == 10) res = res + 3;
		 if(n == 4 || n == 5 || n == 9)            res = res + 4;
		 if(n == 3 || n == 7 || n == 8 || n == 40 || n == 50 || n == 60) res = res + 5;
		 if(n == 11 || n == 12 || n == 20 || n == 30 || n == 80 || n == 90) res = res + 6;
		 if(n == 15 || n == 16 || n == 70) res = res + 7;
		 if(n == 13 || n == 14 || n == 18 || n == 19) res = res + 8;
		 if(n == 17) res = res + 9;
		
		return res;
	}
	 
	/* for numbers 20><100 except those ending in 0 */
	public static int biggerAdditions(int n, int res){
		
		int last = getLastChars(n,1);
		//lenght 7
		if(n > 70 && n < 80){
			 if(last != 0){
				 res = 7 + simpleAdditions(last,res); // +7	 
			 }
		 }
		 // lenght 5
		 if(n > 40 && n < 70){
			 if(last != 0){
				 res = 5 + simpleAdditions(last,res); // +5	 
			 }
		 }
		 // for the numbers that are of lenght 6
		 if((n > 20 && n < 40) || (n > 80 && n < 100)){
			 if(last != 0){
				 res = 6 + simpleAdditions(last,res); // +6 
			 }
		 }
		
		return res;
	}
	 
	 
	/*
	 * --> Extracts the last digit/s from a number <--
	 *  n = the number from which the last digits are extracted
	 *  numOfChars = the number of digits to be extracted 1+
	 */
	public static int getLastChars(int n, int numOfChars){
		int resultingInt = 0;
		String temp = Integer.toString(n);
		 
		// gets the first digit of the number ex: 1002 -> 2 
		if(numOfChars == 1){
			char lastChar = temp.charAt(temp.length()-1);
			String lastStr = lastChar + "";				 
			resultingInt = Integer.parseInt(lastStr);
		}
		// gets the first two digits of the number ex: 1002 -> 02 
		if(numOfChars == 2){
			String lastStr = "" + temp.charAt(temp.length()-2) + temp.charAt(temp.length()-1);
			resultingInt = Integer.parseInt(lastStr);
		}
		return resultingInt;
	}
}
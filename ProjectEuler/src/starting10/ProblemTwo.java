package starting10;

public class ProblemTwo {

	public static void main(String[] args) {
		
		int first = 0, second = 1;
		int total = 0;
		while(second < 4000000){
			if(second%2 == 0){
				total = total + second;
			}
			
			int temp = second;
			second = first + second;
			first = temp;
		}
		System.out.println(total);
	}

}

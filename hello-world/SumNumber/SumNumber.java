public class SumNumber {
	
	public static void main(String args[]){
		
		long result = 0;
		
		for(int i=1; i<=99; i+=2){
			result += i;
		}
		
		System.out.print("Result = " + result);
	}
	
}
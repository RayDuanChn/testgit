
public class CalculateTheFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long result = 0;
		int j = 1;
		
		for(int i=1; i<10; i++) {
			j = j*i;
			result += j;
			System.out.println(j);
		}

		System.out.print(result);
	}

}


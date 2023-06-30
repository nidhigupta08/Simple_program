// number> 1;
// which has only 2 factors 1 and itself.
public class PrimeNumber {

	public static void main(String args[]) {
		int num= 3;   // given number 
		int count = 0; // count used for factor (how many factor the given number has.)
		
		if(num> 1) {   //i<=num means i=1,2,3 (from this 3 should be divisible by only two if not means not prime number)
			for(int i=1; i<=num;i++)   
			{
				if(num%i == 0) 
					count++;
			}
			if(count == 2) {
				System.out.println("Given number is Prime number ");
			}
			else {
				System.out.println("Not a prime number");
			}
		}
		else {
			System.out.println(" Given number is not a prime number");
		}
	}
}


public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.out.println(factorial(8));
	}
public  static long factorial(long num) {
	if(num==1) {
		return 1;
	}
	else {
		return (num*factorial(num-1));
	}
}
}

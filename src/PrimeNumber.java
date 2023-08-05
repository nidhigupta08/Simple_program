
public class PrimeNumber {

	public static void main(String args[]) {
				System.out.println(isPrime(19)); // true
				System.out.println(isPrime(49)); // false
			}
	// 0 and 1 are not prime numbers
			public static boolean isPrime(int n) {
				if (n == 0 || n == 1) {
					return false;
				}
				if (n == 2) {
					return true;
				}
				 // if n is divisible by i, then n is not prime
				for (int i = 2; i <= n / 2; i++) {
					if (n % i == 0) {
						return false;
					}
				}

				return true;
			}
	}


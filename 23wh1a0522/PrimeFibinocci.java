package java_practise;
import java.util.*;

public class PrimeFibinocci {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the range: ");
		int n = scanner.nextInt();
		int a = 0;
		int b = 1;
		for(int i=2;i<n;i++) {
			int add1 = a + b;
			a = b;
			b = add1;
			if(isPrime(add1)) {
				System.out.println(add1);
			}
		}
	}
	public static boolean isPrime(int num) {
		int count = 0;
		for (int i=1;i<=num;i++) {
			if(num%i==0) {
				count+=1;
			}
		}
		if(count == 2) {
			return true;
		}
		return false;
		
	}
}

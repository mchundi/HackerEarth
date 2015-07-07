import java.math.BigInteger;
import java.util.Scanner;



public class FibonacciModified{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		BigInteger start1 = sc.nextBigInteger();
		BigInteger start2 = sc.nextBigInteger();
		int len = sc.nextInt();
		BigInteger thirdElement = start1.multiply(start1).add(start2);
		fib(thirdElement,start2,len-2);
	}
	
	static void fib(BigInteger a,BigInteger b,int m){
		if(m<=1){
			System.out.println(a.toString());
			System.exit(0);
		}
		else
			 fib(a.multiply(a).add(b),a,--m);
		
	}
}
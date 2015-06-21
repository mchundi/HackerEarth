import java.math.BigInteger;
import java.util.Scanner;

public class Digit{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		BigInteger A = sc.nextBigInteger();
		BigInteger B = sc.nextBigInteger();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		BigInteger K = sc.nextBigInteger();
		int c=0;
		while(A.compareTo(B) != 1){
			int sum = digitSum(A).intValue();
			if(X<=sum && sum<=Y && A.mod(K).compareTo(BigInteger.ZERO)==0)
				c++;
			A = A.add(BigInteger.ONE);
		}
		System.out.println(c);
	}
	static BigInteger digitSum(BigInteger n){
		BigInteger sum = BigInteger.ZERO;
		while(n.compareTo(BigInteger.ZERO) != 0){
			sum = sum.add(n.mod(BigInteger.TEN));
			n = n.divide(BigInteger.TEN);
		}
		return sum;
	}
}

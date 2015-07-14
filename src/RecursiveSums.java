import java.math.BigInteger;
import java.util.*;

public class RecursiveSums{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int tcCnt = sc.nextInt();
		
		while(tcCnt--!=0){
			BigInteger initialSum=BigInteger.ZERO;
			int blockCnt = sc.nextInt();
			while(blockCnt--!=0){
				BigInteger len = sc.nextBigInteger();
				BigInteger ele = sc.nextBigInteger();
				initialSum = initialSum.add(len.multiply(ele));
			}
			if(initialSum.divide(BigInteger.TEN).compareTo(BigInteger.ZERO) != 0)
				System.out.println(recursiveSum(initialSum));
			else
				System.out.println(initialSum);
		}
	}
	static BigInteger recursiveSum(BigInteger n){
		if(n.divide(BigInteger.TEN).compareTo(BigInteger.ZERO) == 0)
			return n;
		else{
			BigInteger sum =BigInteger.ZERO;
			while(n.compareTo(BigInteger.ZERO)>0){
				sum = sum.add(n.mod(BigInteger.TEN));
				n = n.divide(BigInteger.TEN);
			}
			return recursiveSum(sum);
		}
	}
}
import java.math.BigInteger;
import java.util.Scanner;

public class BytelandianGoldCoin{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			//BigInteger coinNum = sc.nextBigInteger();
			long coinNum = sc.nextLong();
			System.out.println(maxDollar(coinNum));
		}
	}
	
	static long maxDollar(long n){
		if(n==0)
			return 0;
		long res1 = n;
		long res2 = maxDollar(n/2)+maxDollar(n/3)+maxDollar(n/4);
		return Math.max(res1,res2);
	}
	static BigInteger maxDollar(BigInteger n){
		BigInteger dollar1 = n;
		BigInteger dollar2 = n.divide(new BigInteger(String.valueOf(2))).add(n.divide(new BigInteger(String.valueOf(3)))).add(n.divide(new BigInteger(String.valueOf(4))));
		
		if(dollar1.compareTo(dollar2)>0)
			return dollar1;
		else
			return dollar2;
	}
}
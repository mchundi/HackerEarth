import java.math.BigInteger;
import java.util.*;

public class BigIntegerFactorial{
	public static void main(String args[]){
		BigInteger n = new Scanner(System.in).nextBigInteger();
		System.out.println(fact(n));
	}
	static BigInteger fact(BigInteger b){
		if(b.compareTo(BigInteger.ONE)<=0)
			return BigInteger.ONE;
		else
			return b.multiply(fact(b.subtract(BigInteger.ONE)));
	}
}
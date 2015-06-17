import java.util.Scanner;
import java.math.BigInteger;

public class MinimalCombinatorial{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc--!= 0){
			BigInteger n = sc.nextBigInteger();
			BigInteger r = sc.nextBigInteger();
			System.out.println(fact(n).divide((fact(r).multiply(fact(n.subtract(r))))));
		}
	}
	
	static BigInteger fact(BigInteger n){
		
		if(n.equals(BigInteger.ONE))
			return BigInteger.ONE;
		return (fact(n.subtract(BigInteger.ONE))).multiply(n);
	}
}
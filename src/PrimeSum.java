import java.math.BigInteger;
import java.util.Scanner;

public class PrimeSum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int tcCount = sc.nextInt();
		while(tcCount-- != 0){
			BigInteger a = sc.nextBigInteger();
			BigInteger b = sc.nextBigInteger();
			BigInteger primeSum= BigInteger.ZERO;
			while(a.intValue() <= b.intValue()){
				BigInteger np = a.nextProbablePrime();
				primeSum = primeSum.add(np);
				a = a.add(np).subtract(BigInteger.ONE);
			}
			System.out.println(primeSum);
		}
	}
}
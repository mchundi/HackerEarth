import java.io.*;
import java.math.BigInteger;

public class SumOfDigits{
	
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		BigInteger finalSum1=BigInteger.valueOf(0);
		BigInteger sum2=BigInteger.valueOf(0);
		while(n != 0){
			BigInteger input = new BigInteger(br.readLine());
			finalSum1 = finalSum1.add(addDigits(input));
			sum2 =sum2.add(input);
			n--;
		}
		BigInteger output = finalSum1.remainder(BigInteger.valueOf(9)).subtract(addDigits(sum2).remainder(BigInteger.valueOf(9)));  
		System.out.println(output);
	}
	
	static BigInteger addDigits(BigInteger num){
		BigInteger sum = BigInteger.valueOf(0);
		while(!num.equals(BigInteger.valueOf(0))){
			sum = sum.add(num.remainder(BigInteger.valueOf(10)));
			num = num.divide(BigInteger.valueOf(10));
		}
		return sum;
	}
}
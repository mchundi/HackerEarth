import java.math.BigInteger;

public class ReversePrimes{
	
	public static void main(String args[]){
		BigInteger loopCount = BigInteger.valueOf((long) Math.pow(10, 2));
		BigInteger [] output = new BigInteger[(int) Math.pow(10, 2)];
		int i=0;
		while(!loopCount.equals(BigInteger.valueOf(0)) ){
			
			if(isPrime(loopCount) && isPrime(isReverse(loopCount))){
				output[i] = loopCount;
				System.out.print(output[i]+" ");
				i++;
			}
			loopCount = loopCount.subtract(BigInteger.valueOf(1));
		}
		System.out.println();
		verifyOutput(output,i);
	}
	
	static boolean isPrime(BigInteger loopCount){
		return loopCount.isProbablePrime(1);
	}
	
	static BigInteger isReverse(BigInteger num){
		BigInteger revNum=BigInteger.valueOf(0);
		BigInteger remainder = BigInteger.valueOf(0);
		while(num != BigInteger.valueOf(0)){
			remainder = num.remainder(BigInteger.valueOf(10));
			revNum = revNum.multiply(BigInteger.valueOf(10)).add(remainder);
			num = num.divide(BigInteger.valueOf(10));
		}
		return revNum;
	}
	
	static void verifyOutput(BigInteger[] inArr,int arrLen){
		int j=0;
		for(int i=0;i<arrLen;i++){
			BigInteger revNum = isReverse(inArr[i]);
			for(j=i+1;j<arrLen;){
				if(!revNum.equals(inArr[j]))
					j++;
				else
					break;
			}
			if(j>=arrLen-1)
				System.out.print(inArr[i]+" ");
		}
	}
}
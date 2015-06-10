import java.io.*;
import java.util.Arrays;

public class PrimeNumbers{
	
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tcCnt = Integer.parseInt(br.readLine());
		while(tcCnt != 0){
			long weight = Long.parseLong(br.readLine());
			long[] primeWeights = primeNumbers(weight);
			System.out.println(AdjacentSum(primeWeights,weight)?"Deepa":"Arjit");
			tcCnt--;
		}
	}
	
	static long[] primeNumbers(long n){
		long [] outArr = new long[(int) n];
		int k=0;
		for(int i=2;i<n;i++){
			int sqr_root = (int) Math.sqrt(i);
            boolean is_prime = true;
            for (int j = 2; j <= sqr_root; j++) {
                if (i % j == 0) {
                    is_prime = false;
                }
            }
            if (is_prime) {
            	outArr[k]=i;
            	k++;
            }
		}
		long finalArr[] =new long[k];
		for(int i=0;i<k;i++)
			finalArr[i]=outArr[i];
		return finalArr;
	}
	
	static boolean AdjacentSum(long [] inArr,long weight){
		Arrays.sort(inArr);
		for(int i=0;i<inArr.length-1;i++){
			if(inArr[i]+inArr[i] == weight)
				return true;
			else if(inArr[i]+inArr[i+1] == weight)
				return true;
		}
		return false;
	}
}
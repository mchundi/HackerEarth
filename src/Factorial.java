import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Factorial{
	public static void main(String args[] ) throws Exception {
        //read input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tcCount = Integer.parseInt(br.readLine());
		for(int i=0;i<tcCount;i++){
			BigInteger factNum = new BigInteger(br.readLine());
			System.out.println(calcFactorial(factNum));
		}
    }
    static BigInteger calcFactorial(BigInteger factNum){
		if(factNum.equals(new BigInteger(String.valueOf(1))))
			return new BigInteger(String.valueOf(1));
		else{
			BigInteger res = factNum.add(new BigInteger(String.valueOf(-1)));
			return factNum.multiply(calcFactorial(res));
		}
	}
}
import java.math.BigInteger;
import java.util.*;

public class DiscoverMonk{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int arrSize = sc.nextInt();
		int queries = sc.nextInt();
		List<BigInteger> inArr = new ArrayList<BigInteger>();
		for(int i=0;i<arrSize;i++)
			inArr.add(sc.nextBigInteger());
		while(queries--!=0){
			BigInteger numFind = sc.nextBigInteger();
			if(inArr.contains(numFind))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
import java.math.BigInteger;
import java.io.*;

public class Polynomial{
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tcCount = Integer.parseInt(br.readLine());
		while(tcCount-- !=0){
			String[] s = br.readLine().split(" ");
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			int c = Integer.parseInt(s[2]);
			BigInteger k = new BigInteger(s[3]);
			find(a,b,c,k);
		}
	}
	static void find(int a,int b,int c,BigInteger k){
		for(int i=0;;i++){
			double expression = a*Math.pow(i, 2)+b*i+c;
			if(expression >= k.intValue()){
				System.out.println(i);
				return;
			}
		}
	}
}
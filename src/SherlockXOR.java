import java.util.Scanner;

public class SherlockXOR{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int tcCnt = sc.nextInt();
		while(tcCnt-- != 0){
			int len = sc.nextInt();
			long[] a = new long[len];
			for(int i=0;i<len;i++)
				a[i]=sc.nextLong();
			System.out.println(xorPair(a));
		}
	}
	static long xorPair(long[] n){
		long eCnt=0,oCnt=0;
		for(int i=0;i<n.length;i++){
			if(n[i]%2 == 0)
				eCnt++;
			else
				oCnt++;
		}
		return oCnt*eCnt;
	}
}
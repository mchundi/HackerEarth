import java.util.Scanner;

public class HackSequence{
	public static void main(String a[]){
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0){
			System.out.println(hs(s.nextLong())%1000000007);
		}
	}
	static long hs(long n){
		if(n<=2) return 1;
		else{
			return 2014*hs(n-1)+69*hs(n-2);
		}
	}
}
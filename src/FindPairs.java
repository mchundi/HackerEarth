import java.util.Scanner;

public class FindPairs{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
			int len = sc.nextInt();
			int a[] = new int[len];
			for(int i=0;i<len;i++)
				a[i]=sc.nextInt();
			System.out.println(pairCnt(a));
		}
	}
	static int pairCnt(int[] a){
		int c=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if(a[i]==a[j] && i<=j)
					c++;
			}
		}
		return c;
	}
}
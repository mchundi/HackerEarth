import java.util.Scanner;

public class InverseList{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int tcCnt = sc.nextInt();
		while(tcCnt-- != 0){
			int n = sc.nextInt();
			int orgArr[] = new int[n];
			for(int i=0;i<n;i++)
				orgArr[i] = sc.nextInt();
			isInverse(orgArr);
		}
	}
	
	static void isInverse(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.println("i:"+i);
			System.out.println("a[a[i]-1]:"+a[a[i]-1]);
			if(i+1 != a[a[i]-1]){
				System.out.println("not inverse");
				return;
			}
		}
		System.out.println("inverse");
	}
}
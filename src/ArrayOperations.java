
import java.util.Scanner;

public class ArrayOperations{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int S=0;
		while(t-- != 0){
			int arrLen = sc.nextInt();
			int opCnt = sc.nextInt();
			int[] arr = new int[arrLen+opCnt];
			int i=0;
			while(i<arrLen)
				arr[i++]=(sc.nextInt());
			while(opCnt-- != 0){
				S = arrSum(arr);
				arr[i++]=S+1;;
				
			}
			minAdded(arr,arrLen);
		}
	}
	
	static int arrSum(int[] a){
		int res=0;
		for(int i=0;i<a.length;i++)
			res += a[i];
		return res;
	}
	
	static void minAdded(int[] a,int orgLen){
		int min=0;
		for(int i=orgLen;i>a.length;i++){
			if(min>a[i])
				min=a[i];
		}
		if(min%2 == 0)
			System.out.println("even");
		else
			System.out.println("odd");
	}
}

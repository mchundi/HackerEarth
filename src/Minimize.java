import java.util.Scanner;

public class Minimize{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int branchCount = sc.nextInt();
		int[] studentCnt = new int[branchCount];
		while(branchCount-- != 0){
			studentCnt[branchCount] = sc.nextInt();
		}
		branchReduce(studentCnt);
	}
	
	static void branchReduce(int[] a){
		
		while(a.length>1){
			a=removeZeros(a);
			if(a.length==0)
				break;
			int c =0;
			int min = 0;
			if(a.length != 0)
				min=minElement(a);
				
			for(int j=0;j<a.length;j++){
				a[j] = a[j]-min;
				c++;
			}
			System.out.println(c);
		}
		
	}
	
	static int minElement(int[] a){
		int min = a[0];
		for(int i=0;i<a.length;i++){
			if(min>a[i])
				min = a[i];
		}
		return min;
	}
	
	static int[] removeZeros(int[] a){
		int[] out = new int[a.length];
		int j=0;
		for(int i=0;i<a.length;i++){
			if(a[i]!=0){
				out[j]=a[i];
				j++;
			}
		}
		int[] res = new int[j];
		for(int k=0;k<j;k++)
			res[k] = out[k];
		return res;
	}
}
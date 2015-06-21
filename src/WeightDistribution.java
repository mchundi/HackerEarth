import java.util.Scanner;

public class WeightDistribution{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int[] arr = new int[w];
		for(int i=0;i<w;i++)
			arr[i]=sc.nextInt();
		int query = sc.nextInt();
		while(query-- != 0){
			int e = sc.nextInt();
			if(arrContains(arr,e))
				System.out.println("I Like You");
			else if(sumWeight(arr,e))
				System.out.println("I Like You");
			else
				System.out.println("I Hate You");
		}
	}
	static boolean arrContains(int[] a,int e){
		for(int i=0;i<a.length;i++){
			if(a[i]==e)
				return true;
		}
		return false;
	}
	static boolean sumWeight(int[] a, int n){
		for(int i=0;i<a.length;i++){
			for(int j=1;j<a.length-1;j++){
				if(a[i]+a[j]==n)
					return true;
			}
		}
		return false;
	}
}
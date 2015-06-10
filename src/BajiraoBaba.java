import java.util.Arrays;
import java.util.Scanner;

public class BajiraoBaba{
	
	public static void main(String args[]) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		int menCount = sc.nextInt();
		int [] officer = new int[menCount];
		int [] shooter = new int[menCount];
		int i=0,j=0;
		while(menCount != 0){
			int n = sc.nextInt();
			if(n%2 == 0){
				officer[i] = n;
				i++;
			}
			else{
				shooter[j] = n;
				j++;
			}
			menCount--;
		}
		officer=Arrays.copyOf(officer, i);
		shooter=Arrays.copyOf(shooter, j);
		
		Arrays.sort(officer);
		print(officer);
		System.out.println();
		print(reverse(shooter));
	}
	
	static int[] reverse(int[] inArr){
		Arrays.sort(inArr);
		int[] outArr = new int [inArr.length];
		for(int i=0,j=inArr.length-1;i<inArr.length;i++,j--){
			outArr[i]=inArr[j];
		}
		return outArr;
	}
	
	static void print(int[] inArr){
		for(int i=0;i<inArr.length;i++)
			System.out.print(inArr[i]+" ");
	}
}
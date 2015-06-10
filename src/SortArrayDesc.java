import java.util.Arrays;
import java.util.Scanner;

public class SortArrayDesc{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int tcCount = sc.nextInt();
		
		while (tcCount > 0){
			int arrayLength = sc.nextInt();
			int[] unsortedArray = new int[arrayLength];
			int i=0;
			while(sc.hasNextInt() && i<arrayLength){
				unsortedArray[i] = sc.nextInt();
				i++;
			}
			Arrays.sort(unsortedArray);
			System.out.println();	
			sortDesc(unsortedArray);
			tcCount--;
		}
	}
	static void sortDesc(int [] inArr){
		for(int i=inArr.length-1;i>=0;i--)
			System.out.print(inArr[i]+" ");
	}
}
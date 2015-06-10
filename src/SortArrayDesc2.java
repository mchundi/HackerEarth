import java.util.Arrays;
import java.util.Scanner;

public class SortArrayDesc2{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int tcCount = sc.nextInt();
		
		while (tcCount > 0){
			int array1Length = sc.nextInt();
			int array2Length = sc.nextInt();
			int[] sortedArray1 = new int[array1Length];
			int[] sortedArray2 = new int[array2Length];
			int i=0;
			while(sc.hasNextInt() && i<array1Length){
				sortedArray1[i] = sc.nextInt();
				i++;
			}
			i=0;
			while(sc.hasNextInt() && i<array2Length){
				sortedArray2[i] = sc.nextInt();
				i++;
			}
			int[] unsortedArray = new int[array1Length+array2Length];
			unsortedArray = mergeArrays(sortedArray1,sortedArray2);
			
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
	
	static int[] mergeArrays(int[] a,int[] b){
		int len = a.length+b.length;
		int[] outArr = new int[len];
		int i=0,j=0;
		while(i<a.length){
			outArr[i] = a[i];
			i++;
		}
		while(j<b.length && i<len){
			outArr[i]=b[j];
			j++;
			i++;
		}
		return outArr;
	}
}
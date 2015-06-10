import java.util.Scanner;
import java.util.Arrays;

public class FindingPairs{
	
	public static void main(String args[])throws Exception{
		Scanner sc = new Scanner(System.in);
		int tcCount = sc.nextInt();
		while(tcCount != 0){
			int arrayLength = sc.nextInt();
			int[] inArr = new int[arrayLength];
			for(int i=0;i<arrayLength;i++)
				inArr[i] = sc.nextInt();
			Arrays.sort(inArr);
			System.out.println(distinctPairs(inArr));
			tcCount--;
		}
	}
		
		static int distinctPairs(int[] a){
			int pairCount =0;
			for(int i=0;i<a.length;i++){
				int j=i;
				while(i<=j && j<a.length && a[i] == a[j] ){
					j++;
					pairCount++;
				}
			}
			return pairCount;
		}
	}
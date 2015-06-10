import java.util.Scanner;

public class PuchiAndLuggage{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int tcCount = sc.nextInt();
		
		while(tcCount != 0){
			int arrLen = sc.nextInt();
			int[] weightArr = new int[arrLen];
			int i=0;
			while(i<arrLen){
				weightArr[i] = sc.nextInt();
				i++;
			}
			int futureCount =0;
			
			for(i=0;i<arrLen;i++){
				futureCount=0;
				int j=i+1;
				while(j<arrLen){
					if(weightArr[i]>weightArr[j])
						futureCount++;
					j++;
				}
				System.out.print(futureCount+" ");
			}
			System.out.println();
			tcCount--;
		}
	}
}
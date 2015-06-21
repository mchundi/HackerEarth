import java.util.Scanner;

public class HitArray{
	public static void main(String args[]){
		 Scanner sc = new Scanner(System.in);
			int length = sc.nextInt();
			int[] arr = new int[length];
			for(int i=0;i<length;i++)
				arr[i] = sc.nextInt();
			int hitCnt = sc.nextInt();
			while(hitCnt-- != 0){
				int hitParam = sc.nextInt();
				for(int i=0;i<length;i++){
					if(arr[i]>hitParam)
						arr[i] -= 1;
				}
			}
			for(int i=0;i<length;i++)
				System.out.print(arr[i]+" ");
		}
	}
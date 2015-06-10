import java.util.Scanner;

public class MonkAndPoison{
	
	public static void main(String args[]) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		int tcCount = sc.nextInt();
		
		while(tcCount-- != 0){
			int poisonCount = 0;
			int arrLength = sc.nextInt();
			int curseCount = sc.nextInt();
			
			//Read input array
			int inArr[][] = new int[arrLength][arrLength];
			for(int i=0;i<arrLength;i++)
				for(int j=0;j<arrLength;j++)
					inArr[i][j] = sc.nextInt();
			
			for(int i=0,row=0,col=0; i< curseCount;i++){
				if(i%2 == 0){
					for(int k=0;k<arrLength;k++){
						poisonCount += inArr[k][col];
						inArr[k][col]++;
					}
					col++;
				}
				else{
					for(int k=0;k<arrLength;k++){
						poisonCount += inArr[row][k];
						inArr[row][k]++;
					}
					row++;
				}
			}
			System.out.println(poisonCount);
		}
	}
}
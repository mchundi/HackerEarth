import java.util.Scanner;

public class DiagonalDifference{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int matrixSize = sc.nextInt();
		int matrix[][] = new int[matrixSize][matrixSize];
		for(int i=0;i<matrixSize;i++){
			for(int j=0;j<matrixSize;j++)
				matrix[i][j]=sc.nextInt();
		}
		System.out.println(difference(matrix));
	}
	
	static int difference(int[][] a){
		int dSum1=0,dSum2=0;
		int i=0,j=0;
		while(i<a.length && j<a.length)
			dSum1 += a[i++][j++];
		i=0;
		//j=a.length;
		while(i<a.length && j>=0)
			dSum2 += a[i++][--j];
		
		return Math.abs(dSum1-dSum2);
	}
}
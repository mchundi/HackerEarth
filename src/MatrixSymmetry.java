import java.util.Scanner;

public class MatrixSymmetry{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int tcCount = sc.nextInt();
		String st = "";
		while(tcCount-- != 0){
			int matrixlength = sc.nextInt();
			char[][] inArr = new char[matrixlength][matrixlength];
			for(int i=0;i<matrixlength;i++){
				st = sc.next();
				for(int j=0;j<matrixlength;j++)
					inArr[i][j] = st.charAt(j);
			}
			System.out.println(isSymmetry(inArr,matrixlength));
		}
	}
	static String isSymmetry(char[][] inArr,int n){
		int rowSymCnt = 0, colSymCnt = 0, row=0, col=0,i=0;
		for(row=0;row<n;row++){
			
		}
		
		while(row<n){
			col=0;
			if(inArr[row].toString().equals(inArr[n-row-1].toString()))
				rowSymCnt++;
			while(col<n){
				if(inArr[row][col] == inArr[row][n-col-1])
					i++;
				if(i==n)
					colSymCnt++;
				col++;
			}
			row++;
		}
		if(rowSymCnt==n/2 && colSymCnt==n/2)
			return "BOTH";
		else if(rowSymCnt==n/2)
			return "HORIZONTAL";
		else if(colSymCnt==n/2)
			return "VERTICAL";
		else
			return "NO";
	}
}
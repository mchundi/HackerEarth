import java.util.Scanner;

public class Fraction{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int inputCnt = sc.nextInt();
		double pCnt=0,nCnt=0,zCnt=0;
		for(int i=0;i<inputCnt;i++){
			int n =sc.nextInt();
			if(n >0)
				pCnt++;
			else if(n<0)
				nCnt++;
			else
				zCnt++;
		}
		System.out.println(String.format("%.3f", pCnt/inputCnt));
		System.out.printf("%.3f\n",nCnt/inputCnt);
		System.out.printf("%.3f\n",zCnt/inputCnt);
		
		/*alternate to specify number of decimal digits to be printed
		 * DecimalFormat numberFormat = new DecimalFormat("#.000");
			System.out.println(numberFormat.format(pCnt/inputCnt));
			System.out.println(numberFormat.format(nCnt/inputCnt));
			System.out.println(numberFormat.format(zCnt/inputCnt));
		 */
	}
}
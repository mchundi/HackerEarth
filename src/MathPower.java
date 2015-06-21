import java.util.Scanner;

public class MathPower{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0){
			long f1 = (long) Math.pow(sc.nextLong(),sc.nextLong());
			long f2 = (long) Math.pow(sc.nextLong(),sc.nextLong());
			System.out.printf("%.0lf\n",Math.pow(f1,f2)%sc.nextLong());
		}
	}
}
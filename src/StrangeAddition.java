import java.util.Scanner;

public class StrangeAddition{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int tcCnt = sc.nextInt();
		while(tcCnt-- != 0){
			System.out.println(flip(flip(sc.nextInt())+flip(sc.nextInt())));
		}
	}
	static int flip(int n){
		if(n%10 == 0)
			n=removeZeros(n);
		int res=0;
		while(n >0){
			res = res*10 + n%10;
			n=n/10;
		}
		return res;
	}
	
	static int removeZeros(int n){
		int res=0,c=0;
		while(n > 0){
			if(n%10 == 0 && c==0){
				res= res*10 +n/10;
			}
			else
				c++;
			n=n/10;
		}
		return res;
	}
}
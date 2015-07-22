import java.util.Scanner;

public class PrimeRule{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(), n=0;
		while(t--!= 0){
			n=sc.nextInt()+1;
			while(! isPrime(n))
				n++;
			System.out.println(n);
		}
	}
	static boolean isPrime(int n){
		for(int i=2;i<Math.sqrt(n);i++){
			if(n%i == 0)
				return false;
		}
		return true;
	}
}
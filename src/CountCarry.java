import java.util.Scanner;

public class CountCarry{
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int tcCount = sc.nextInt();
		while(tcCount-- != 0){
			long num1 = sc.nextLong();
			long num2 = sc.nextLong();
			sum(num1,num2);
		}
	}
	static void sum(long n1,long n2){
		int carryCnt=0;
		while(n1!=0 || n2!=0){
			if(n1%10+n2%10>9)
				carryCnt++;
			n1/=10;
			n2/=10;
		}
		if(carryCnt==0)
			System.out.println("No carry operation");
		else if(carryCnt==1)
			System.out.println(carryCnt+" carry operation");
		else
			System.out.println(carryCnt+" carry operations");
	}
}
		
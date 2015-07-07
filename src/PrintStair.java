import java.util.Scanner;

public class PrintStair{
	public static void main(String args[]){
		int height = (new Scanner(System.in)).nextInt();
		for(int i=1;i<=height;i++)
			System.out.println(display(" ",height-i)+display("#",i));
	}
	static String display(String s, int n){
		if(n==0)
			return "";
		if(n==1)
			return s;
		else
			return(s+display(s,--n));
	}
}
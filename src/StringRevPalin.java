//Write a program for String reverse and validate whether it is palindrome or not .
import java.util.Scanner;

public class StringRevPalin{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int tcCnt = sc.nextInt();
		while(tcCnt--!=0){
			StringBuffer str = new StringBuffer(sc.next());
			String orgStr = str.toString();
			String revStr = str.reverse().toString();
			System.out.println("orgStr: "+orgStr+",revStr: "+revStr);
			System.out.println(orgStr.equals(revStr)?"Palindrome":"Not Palindrome");
		}
	}
}
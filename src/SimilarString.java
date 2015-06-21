import java.util.Arrays;
import java.util.Scanner;

public class SimilarString{
	
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		char[] c1 = s.nextLine().toCharArray();
		char[] c2 = s.nextLine().toCharArray();
		if(c1.length == c2.length ){
			Arrays.sort(c1);
			Arrays.sort(c2);
			System.out.println(String.valueOf(c1).equals(String.valueOf(c2))?"YES":"NO");
		}
		else 
			System.out.println("NO");
	}
}
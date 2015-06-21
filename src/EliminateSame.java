import java.util.*;

public class EliminateSame{
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String word = "";
		for(;t>0;t--){
			word = sc.next();
			word = word.replaceAll("(.)\\1+", "$1");
			System.out.println(word);			
		}	
 
	}
 
}
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FunnyString{
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tcCount = Integer.parseInt(br.readLine());
		while(tcCount-- != 0){
			isFunny(br.readLine());
		}
	}
	
	static void isFunny(String s){
		String revS = new StringBuffer(s).reverse().toString();
		int c=0;
		for(int i=1;i<s.length();i++){
			if(Math.abs((int)s.charAt(i)-(int)s.charAt(i-1))
					==Math.abs((int)revS.charAt(i)-(int)revS.charAt(i-1)))
				c++;
		}
		if(c==s.length()-1)
			System.out.println("Funny");
		else
			System.out.println("Not Funny");
	}
}
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class WordTrouble{
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tcCnt = Integer.parseInt(br.readLine());
		while(tcCnt-- != 0){
			String s1 = br.readLine().trim();
			while(s1.equals("")){
				s1=br.readLine().trim();
			}
			String s2 = br.readLine().trim();
			similarity(s1,s2);
		}
	}
	
	static void similarity(String s1,String s2){
		int cnt=0;
		if(s1.equals(s2)){
			System.out.println("Exact");
			return;
		}
		else {
			cnt = Math.abs(s1.length()-s2.length());
			int lim =Math.min(s1.length(), s2.length());
			for(int i=0;i<lim;i++){
				if(s1.charAt(i)!=s2.charAt(i))
					cnt++;
			}
			System.out.println("Non Exact "+cnt);
		}
			
	}
}
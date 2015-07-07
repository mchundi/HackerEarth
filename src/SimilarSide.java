import java.util.*;

public class SimilarSide{
	
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int tcCount = sc.nextInt();
		while(tcCount!=0){
			List<Character> s = new ArrayList<Character>();
			String str = sc.next();
			for(int i=0;i<str.length();i++)
				s.add(str.charAt(i));
			System.out.println(sameAdjacentChar(s));
			tcCount--;
		}
	}
	
	static int sameAdjacentChar(List<Character> c){
		int cnt=0;
		if(c.size()<=1)
			return 0;
		
		for(int i=0;i<c.size()-1;i++){
			if(c.get(i)==c.get(i+1)){
				cnt++;
				c.remove(i);
				cnt=cnt+sameAdjacentChar(c);
			}
		}
		return cnt;
	}
}
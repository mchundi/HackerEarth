import java.util.*;
import java.util.Map.Entry;

public class MostFrequent{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		int n = sc.nextInt();
		while(n-- !=0){
			int i=sc.nextInt();
			if(hm.containsKey(i)){
				hm.put(i, hm.get(i)+1);
			}
			else
				hm.put(i, 1);
		}
		Set<Entry<Integer, Integer>> s = hm.entrySet(); 
		Iterator<Entry<Integer, Integer>> i = s.iterator(); 
		while(i.hasNext()){
			//Entry<Integer, Integer> e = i.next();
			//if(e.getValue())
		}
	}
}
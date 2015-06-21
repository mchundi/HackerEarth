import java.util.*;
import java.util.Map.Entry;

public class MostFrequent{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		LinkedHashMap<Integer,Integer> hm = new LinkedHashMap<Integer,Integer>();
		
		int n = sc.nextInt();
		while(n-- !=0){
			int i=sc.nextInt();
			if(hm.containsKey(i)){
				hm.put(i, hm.get(i)+1);
			}
			else
				hm.put(i, 1);
		}
		int max=0;
		Set<Entry<Integer, Integer>> s = hm.entrySet(); 
		Iterator<Entry<Integer, Integer>> i = s.iterator();
		Entry<Integer, Integer> e = null;
		Entry<Integer, Integer> res = null;
		while(i.hasNext()){
			e = i.next();
			if(max<e.getValue()){
				max = e.getValue();
				res=e;
			}
		}
		System.out.print(res.getKey());
	}
}
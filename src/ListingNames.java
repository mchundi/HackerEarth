import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
//import java.util.Map.Entry;

public class ListingNames{
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		while(num--!=0){
			String s = br.readLine();
			if(hm.containsKey(s))
				hm.put(s, hm.get(s)+1);
			else
				hm.put(s, 1);
		}
		List<String> l = new ArrayList<String>(hm.keySet());
		Collections.sort(l);
		//LinkedHashMap<String,Integer> lhm = new LinkedHashMap<String,Integer>();
		for(int i=0;i<l.size();i++){
			System.out.println(l.get(i)+" "+hm.get(l.get(i)));
			//lhm.put(l.get(i), hm.get(l.get(i)));
		}
		/*Iterator<Map.Entry<String, Integer>> i = lhm.entrySet().iterator(); 
		while(i.hasNext()){
			Entry<String,Integer> e = i.next();
		    System.out.println(e.getKey()+" "+e.getValue());
		}*/
	}
}
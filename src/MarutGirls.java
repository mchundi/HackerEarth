import java.io.*;
import java.util.*;

public class MarutGirls{
	@SuppressWarnings("unchecked")
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int mQual = Integer.parseInt(br.readLine());
		String in[] = br.readLine().split(" ");
		
		HashSet<String> qualities = new HashSet<String>();
		HashSet<String> cloneQualities =  new HashSet<String>();
		
		for(int i=0;i<mQual;i++)
			qualities.add(in[i]);
		
		int girlCnt = Integer.parseInt(br.readLine());
		int accept=0;
		while(girlCnt--!=0){
			in = br.readLine().split(" ");
			
			cloneQualities = 	(HashSet<String>) qualities.clone();
			
			for(int i=0;i<in.length;i++){
				if(cloneQualities.contains(in[i]))
					cloneQualities.remove(in[i]);
			}
			if(cloneQualities.size()==0)
				accept++;
		}
		System.out.println(accept);
	}
}
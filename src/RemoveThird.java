import java.util.ArrayList;
import java.util.List;


public class RemoveThird{
	public static void main(String args[]){
		List<Integer> a = new ArrayList<Integer>();
		for(int i=0;i<15;i++)
			a.add(i);
		findIndex(a);
	}
	
	static void findIndex(List<Integer> a){
		int count =0,index=0;
		if(a.size()<=1)
			return;
		else{
			while(count<a.size()){
				if(count+2>=a.size()-1)
					count=0;
					
				//a.remove(count+2);
				index = count;
				count += 3;
			}
		}
		System.out.println(index+1);
	}
}
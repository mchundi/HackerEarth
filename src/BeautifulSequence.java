import java.util.*;

public class BeautifulSequence{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int tcCount = sc.nextInt();
		while(tcCount-- != 0){
			int orgLen = sc.nextInt();
			int c=0;
			LinkedList<Integer> arr = new LinkedList<Integer>();
			for(int i=0;i<orgLen-1;i++){
				int element =sc.nextInt();
				if(element<0)
					c++;
				else if(!arr.isEmpty()){
					if(element>arr.getFirst()){
						arr.add(element,i+1);
						c++;
					}
					else{
						arr.addFirst(element);
						c++;
					}
				}
				else
					arr.add(sc.nextInt());
			}
			
			System.out.println(c);
		}
	}
}
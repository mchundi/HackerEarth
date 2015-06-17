import java.util.LinkedList;
import java.util.Scanner;

public class QueueMonk{
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int processCount = sc.nextInt();
		
		LinkedList<Integer> callOrder = new LinkedList<Integer>(); 
		LinkedList<Integer> idealOrder = new LinkedList<Integer>();
		int time =0;
			
		for(int i=0;i<processCount;i++)
			callOrder.add(sc.nextInt());
		
		for(int i=0;i<processCount;i++)
			idealOrder.add(sc.nextInt());
		
		while(!callOrder.isEmpty()){
			if(callOrder.getFirst() == idealOrder.getFirst()){
				callOrder.pop();
				idealOrder.pop();
				time++;
			}
			else{
				callOrder.addLast(callOrder.getFirst());
				callOrder.removeFirst();
				time++;
			}
		}
		System.out.println(time);
	}
}
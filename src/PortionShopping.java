import java.util.Scanner;

public class PortionShopping{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		long portionSize = sc.nextLong();
		long modulo = sc.nextLong();
		long totalPortion=0;
		char[] permit = sc.next().toCharArray();
		for(int i=0;i<permit.length;i++){
			if(permit[i]=='1'){
				totalPortion = totalPortion+portionSize;
			}
			portionSize = portionSize*portionSize;
		}
		System.out.println(totalPortion%modulo);
	}
}
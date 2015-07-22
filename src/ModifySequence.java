import java.util.*;

public class ModifySequence{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),a=0;
		
		if(n>0)
			a = sc.nextInt();
		
		for(int i=1;i<n;i++){
			int b=sc.nextInt();
			a = b-a;
			if (a < 0)
				break;
		}
		if(a==0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
import java.util.Arrays;
import java.util.Scanner;

public class Pairing{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(),cnt=0;
		while(t-- != 0){
			int[] boys = new int[sc.nextInt()];
			int[] girls = new int[sc.nextInt()];
			for(int i=0;i<boys.length;i++)
				boys[i]=sc.nextInt();
			for(int i=0;i<girls.length;i++)
				girls[i]=sc.nextInt();
			int loop = Math.min(boys.length, girls.length);
			Arrays.sort(boys);
			Arrays.sort(girls);
			for(int i=0;i<loop;i++){
				for(int j=0;j<girls.length;j++){
					if(boys[i]>girls[j])
						cnt++;
				}
			}
			if(cnt==loop)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
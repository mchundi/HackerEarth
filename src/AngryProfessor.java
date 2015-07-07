import java.util.Scanner;

public class AngryProfessor{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int tcCnt = sc.nextInt();
		while(tcCnt-- != 0){
			int studentCnt = sc.nextInt();
			int limit = sc.nextInt();
			int presentCnt =0;
			while(studentCnt-- != 0){
				if(sc.nextInt() <= 0)
					presentCnt++;
			}
			if(presentCnt >= limit)
				System.out.println("NO");
			else
				System.out.println("YES");
		}
	}
}
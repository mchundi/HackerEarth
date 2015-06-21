import java.util.Scanner;

public class MultipleOfThree{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),c=0;
		while(n-- != 0){
			if(sc.nextInt()%3 == 0)
				c++;
		}
		System.out.println(c);
	}	
}

/*
Scanner sc = new Scanner(System.in);
int n = sc.nextInt(),c=0;
while(n-- != 0){
	if(sc.nextInt()%3 == 0)
		c++;
}
System.out.println(c);
}
}
*/
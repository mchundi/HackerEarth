import java.io.*;
public class LibraryFine{
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] actualRD = br.readLine().split(" ");
		String[] expRD = br.readLine().split(" ");
		
		int fine=0;
		if(returnedBefore(actualRD,expRD))
			fine=0;
		else if(Integer.parseInt(expRD[1]) == Integer.parseInt(actualRD[1]))
			fine = (Integer.parseInt(actualRD[0])-Integer.parseInt(expRD[0]))*15;
		else if(Integer.parseInt(expRD[2]) == Integer.parseInt(actualRD[2]))
			fine = (Integer.parseInt(actualRD[1])-Integer.parseInt(expRD[1]))*500;
		else
			fine = 10000;
		
		System.out.println(fine);
	}
	
	static boolean returnedBefore(String[] a,String[] b){
		int expY=Integer.parseInt(b[2]);
		int expM=Integer.parseInt(b[1]);
		int expD=Integer.parseInt(b[0]);
		
		int actY=Integer.parseInt(a[2]);
		int actM=Integer.parseInt(a[1]);
		int actD=Integer.parseInt(a[0]);
		
		if(expY > actY )
			return true;
		else if (expY== actY && expM>=actM && expD>=actD)
			return true;
		else
			return false;
	}
}
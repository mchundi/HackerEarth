package thoughtWorks;
import java.util.Scanner;

public class DivideAndModulo {
	   static  int count=1;
	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        //int count=1;
	        System.out.println("give the dividend");
	        double m=sc.nextDouble();
	        System.out.println("Give the divisor");
	        double n=sc.nextDouble();
	        System.out.println("The quotient is "+quotient(m,n));
	        System.out.println("The remainder is "+rem(m,n));
	        ;
	    }
	  
	    public static int quotient(double m,double n){
	        
	        double N=n;
	        if(m<n)return 0;
	        else if(m==n)return 1;
	        else{
	            for (;n<m-N; n=n+N) {
	                count++;
	            }
	        }
	        return count;
	    }
	    public static double rem(double m,double n){
	        return m-n*count;
	    }
	}
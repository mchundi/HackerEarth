import java.util.Scanner;

public class TimeFormat{
	public static void main(String args[]){
		String inTime = new Scanner(System.in).next(),res="";
		String in[] = inTime.split(":");
		int changeTime=0;
		
		if(inTime.equalsIgnoreCase("Midnight"))
            System.out.println("00:00:00");
        else if(inTime.equalsIgnoreCase("12 Noon"))
             System.out.println("12:00:00");
		
		else if(inTime.endsWith("PM") ){
			if(Integer.parseInt(in[0])<12)
				changeTime = 12+Integer.parseInt(in[0]);
			else
				changeTime = Integer.parseInt(in[0]);
			res = changeTime+":"+in[1]+":"+in[2];
			
		}
		else{
			if(in[0].equals("12"))
				res = "00:"+in[1]+":"+in[2];
			else
				res=inTime;
		}
		System.out.println(res.substring(0,res.length()-2));
	}
}
	
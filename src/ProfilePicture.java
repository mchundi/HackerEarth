import java.io.*;

public class ProfilePicture{
	
	public static void main(String args[]) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int minDimension = Integer.parseInt(br.readLine());
		int tcCount = Integer.parseInt(br.readLine());
		while(tcCount >0){
			String [] picDim = br.readLine().split(" ");
			int width = Integer.parseInt(picDim[0]);
			int height = Integer.parseInt(picDim[1]);
			if(width>=minDimension && height>=minDimension){
				if(width==height)
					System.out.println("ACCEPTED");
				else
					System.out.println("CROP IT");
			}
			else if (width<minDimension || height<minDimension)
				System.out.println("UPLOAD ANOTHER");
			
			tcCount--;
		}
	}
}
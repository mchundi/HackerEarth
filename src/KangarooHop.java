/* IMPORTANT: class must not be public. */
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tcCount = Integer.parseInt(br.readLine());
		StringBuilder sb= new StringBuilder(tcCount);
		while(tcCount != 0){
			String[] st = (br.readLine()).split(" ");
			long startPoint = Long.parseLong(st[0]);
			long endPoint = Long.parseLong(st[1]);
			long hop = Long.parseLong(st[2]);
			long totalHop=(endPoint/hop)-((startPoint-1)/hop);
			sb.append(totalHop+"\n");
			
			tcCount--;
		}
		System.out.println(sb);
    }
}

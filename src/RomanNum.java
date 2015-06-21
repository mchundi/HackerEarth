import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class RomanNum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0){
			inRoman(sc.nextInt());
		}
	}
	static void inRoman(int n){
		LinkedHashMap<String,Integer> roman_numerals = new LinkedHashMap<String,Integer>();
		roman_numerals.put("C", 100);
	    roman_numerals.put("XC", 90);
	    roman_numerals.put("L", 50);
	    roman_numerals.put("XL", 40);
	    roman_numerals.put("X", 10);
	    roman_numerals.put("IX", 9);
	    roman_numerals.put("V", 5);
	    roman_numerals.put("IV", 4);
	    roman_numerals.put("I", 1);
	    String res = "";
	    for(Entry<String, Integer> entry : roman_numerals.entrySet()){
	      int matches = n/entry.getValue();
	      res += repeat(entry.getKey(), matches);
	      n = n % entry.getValue();
	    }
	    System.out.println(res);
	  }
	  public static String repeat(String s, int n) {
	    if(s == null) {
	        return null;
	    }
	    final StringBuilder sb = new StringBuilder();
	    for(int i = 0; i < n; i++) {
	        sb.append(s);
	    }
	    return sb.toString();
	  }
}

/***Smarter code
 * String roman[] = { "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    int decimal[] = {100,90,50,40,10,9,5,4,1};
 
     while(t-->0)
     {
     	
     str="";
      num=Integer.parseInt(br.readLine());
            for (int i=0; i<9; i++) 
            
                
            while (num >= decimal[i])
                {
                num = num-decimal[i];
                str = str+roman[i];
                }
                  System.out.println(str);
          }
       
        }
	}
 
 */
 */
		
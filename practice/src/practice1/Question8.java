package practice1;
import java.util.HashMap;
public class Question8 {
	public static char maxOccuringChar(String str) {
		HashMap<Character,Integer> hmap = new HashMap();
	
		char maxOccuredChar = '\u0000';
		for(int i=0;i<str.length();i++) {
			if(hmap.containsKey(str.charAt(i))) {
				hmap.put(str.charAt(i), hmap.get(str.charAt(i))+1);
				maxOccuredChar = str.charAt(i);
				
				
			}else {
				hmap.put(str.charAt(i), 1);
			}
		}
		
		return maxOccuredChar;
	}
	public static void main(String[] args) {
		String str = "vviikiash";
		System.out.println(maxOccuringChar(str));
		
	}

}

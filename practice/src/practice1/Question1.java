package practice1;
import java.util.HashMap;
public class Question1 {
	public static String removeDuplicates(String str) {
		HashMap<Character,Integer> m = new HashMap<Character,Integer>();
		String str1 ="";
		
		for(int i=0;i<str.length();i++) {
			if(m.containsKey(str.charAt(i))) {
				continue;
			}else {
				str1=str1+str.charAt(i);
				m.put(str.charAt(i), 1);
			}
		}
		return str1;
	}

	public static void main(String[] args) {
		String str = "vviikkaasshh";
		System.out.println(Question1.removeDuplicates(str));
		

	}

}

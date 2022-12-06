package practice1;
import java.util.HashSet;
public class Question7 {
	public static boolean findDup(String str) {
		HashSet<Character> hset = new HashSet();
		for(int i=0;i<str.length();i++) {
			if(hset.contains(str.charAt(i))) {
				return false;
			}else {
				hset.add(str.charAt(i));
			}
		}
		
		return true;
	}
	public static void main(String[] args) {
		
		String str = "vikaish";
		System.out.println(findDup(str));
		
		
	}

}

package practice1;

import java.util.HashMap;



public class Question2 {
	public static String printDuplicates(String str) {
		HashMap<Character,Integer> m = new HashMap<Character,Integer>();
		String str1 ="";
		
		for(int i=0;i<str.length();i++) {
			if(m.containsKey(str.charAt(i))) {
				str1=str1+str.charAt(i);
			}else {
				
				m.put(str.charAt(i), 1);
			}
		}
		return str1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "vviikaassh";
		System.out.println(Question2.printDuplicates(str));
	}

}

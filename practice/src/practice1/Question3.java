package practice1;

public class Question3 {
	public static String chechIfPalindrome(String str) {
		int i=0,j=str.length()-1;
		while(i<=j) {
			if(str.charAt(i)==str.charAt(j)) {
				i++;
				j--;
				continue;
			}else {
				return "It's not a palindrome";
			}
		}
		
		return "Yes, it's a palindrome";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Question3.chechIfPalindrome("2552"));
	}

}

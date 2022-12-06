package practice1;

public class Question5 {

	public static void main(String[] args) {
		String str1 = "earth";
		String str2  = "heart";
		int flag =0;
		for(int i=0;i<str1.length();i++) {
			
			for(int j=0;j<str2.length();j++) {
				if(str1.charAt(i)==str2.charAt(j)) {
					flag=0;
					break;
				}else {
					flag=1;
				}
			}
			if(flag==1) {
				System.out.println("No , it is not a anagram");
				break;
			}
			
		
		}
		if(flag==0) {
			System.out.println("yes,its a anagram");
		}
		
		

	}

}

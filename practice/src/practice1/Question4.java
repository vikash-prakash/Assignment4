package practice1;

public class Question4 {

	public static void main(String[] args) {
		
		String str = "this is vikash!!";
		Question4.count(str);
		
		
	}
	

	


	private static void count(String str) {
		int countVovel=0,countSpecial=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i) =='o'|| str.charAt(i)=='u') {
				countVovel++;
			}else if(str.charAt(i)=='!' || str.charAt(i)=='&' || str.charAt(i)=='%' || str.charAt(i) =='$'|| str.charAt(i)=='#' || str.charAt(i) =='@'|| str.charAt(i)=='*' || str.charAt(i)=='(' || str.charAt(i) ==')'|| str.charAt(i)=='/' || str.charAt(i) =='+' || str.charAt(i)=='-'){
				countSpecial++;
			}
		}
		String newStr = str.replaceAll(" ","");
		int countConsonent= newStr.length()-(countVovel+countSpecial);
		System.out.println("total no. of vovels are :"+countVovel);
		System.out.println("total no. of specials  are :"+countSpecial);
		System.out.println("total no. of consonents  are :"+countConsonent);
	}

}

package practice1;

public class Question6 {

	public static void main(String[] args) {
		String str1 ="The quick brown fox jumps over the lazy dog";
		String str = str1.replaceAll(" ","");
		
		int f=0;
		for(int i=97;i<=121;i++) {
			int flag=0;
			for(int j=0;j<str.length();j++) {
				char ch = 'a';
				if((int)str.charAt(j)<97) {
					ch = (char)((int)str.charAt(j)+32);
					
				}else {
					ch = str.charAt(j);
				}
				
				if((char)i == ch) {
					flag=1;
					break;
				}
				
				
				
			}
			if(flag==0) {
				f=1;
				System.out.println("It is not a panagram");
				break;
			}
		}
		if(f==0) {
			System.out.println("it is a panagram");
		}
		
		
	}

}

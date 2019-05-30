import java.util.*;
public class VowelsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string");
		String st=s.nextLine();
		String str=st.toLowerCase();
		char ch[]=str.toCharArray();
		int vowel=0,consonent=0;
		for(int i=0;i<str.length();i++) {
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				vowel=vowel+1;
			}
			else
				consonent+=1;
		}
		System.out.println("vowel count is :"+vowel);
		System.out.println("consonent count is :"+consonent);
	}

	

}

import java.util.*;
public class VowelOrConsonent {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String st=s.nextLine();
		String str=st.toLowerCase();
		char ch[]=str.toCharArray();
		if(ch[0]=='a'||ch[0]=='e'||ch[0]=='i'||ch[0]=='o'||ch[0]=='u') 
			System.out.println("vowel");
		else
			System.out.println("consonent");
	}

}

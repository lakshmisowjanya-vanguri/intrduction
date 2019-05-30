import java.util.*;
public class CharToString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string");
		String str=s.nextLine();
		int l=str.length();
		char ch[]=new char[l];
		System.out.print("characters are :");
		for(int i=0;i<l;i++) {
			ch[i]=str.charAt(i);
			System.out.print(ch[i]+"  ");
		}
		System.out.println();
		
		String s2=str.valueOf(ch);
		System.out.print("characters are converted into string :"+s2);
	}

}

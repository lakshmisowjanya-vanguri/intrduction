import java.util.*;
public class ReverseString {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string");
		String str=s.nextLine();
		char ch[]=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
		

	}

}

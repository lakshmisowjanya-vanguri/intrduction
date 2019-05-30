import java.util.*;
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string");
		String str=s.nextLine();
		StringBuffer sb=new StringBuffer(str);
		System.out.println("reverse of a String is :"+sb.reverse());
		System.out.println("enter a number");
		String n=s.nextLine();
		StringBuffer sb1=new StringBuffer(n);
		System.out.println("reverse of a Number is :"+sb1.reverse());
		sb.reverse();
		String s2=sb.toString();
//		s2.concat("java");
//		System.out.println(s2);
		if(sb.equals(str)) 
			System.out.println("pallindrome");
		else
			System.out.println("not a pallindrome");
		
	}

}

import java.util.*;
public class StringSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string");
		String st=s.nextLine();
		char ch[]=st.toCharArray();
		Arrays.sort(ch);
		System.out.println(ch);
		
	}

}

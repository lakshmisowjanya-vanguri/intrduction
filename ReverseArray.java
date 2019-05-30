import java.util.*;
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter array length");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("enter array elements");
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("reverse elements");
		for(int i=a.length-1;i>=0;i--)
			System.out.println(a[i]);
	}

}

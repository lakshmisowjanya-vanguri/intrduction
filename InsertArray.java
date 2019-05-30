import java.util.*;
public class InsertArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter array length");
		int n=s.nextInt();
		int a[]=new int[n+1];
		System.out.println("enter array elements");
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("enter element to be insert");
		int insert=s.nextInt();
		a[n]=insert;
		System.out.println("after inserting the element");
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println(a[n]);
	}
}

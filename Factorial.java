import java.util.*;
public class Factorial {
	int a=1;
	void check(int n) {
		for(int i=1;i<=n;i++) {
		  a=a*i;
		} 
		System.out.println(a);

	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial f=new Factorial();
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt();
		f.check(n);
	}

}

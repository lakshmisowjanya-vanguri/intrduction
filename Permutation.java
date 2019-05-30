import java.util.*;
import java.util.*;
public class Permutation {	
	int fact(int n) {
		int a=1;
		for(int i=1;i<=n;i++) {
			  a=a*i;
		} 
			return a;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Permutation p=new Permutation();
		Scanner s=new Scanner(System.in);
		System.out.println("enter n value");
		int n=s.nextInt();
		System.out.println("enter r value");
		int r=s.nextInt();
		if(n>r) {
			double c=p.fact(n)/p.fact(r)*p.fact(n-r);
			double p1=p.fact(n)/p.fact(n-r);
			System.out.println("combination of number is "+c);
			System.out.println("permutation of number is "+p1);
		}
		else
			System.out.println("enter valid number");
		
	}

}

import java.util.*;
public class Power {
	void power(int n,int power) {
		int res=1;
		for(int i=1;i<=power;i++) {
			 res=res*n;
		}
		System.out.println("power of a number :"+res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Power p=new Power();
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt();
		System.out.println("enter power number");
		int pow=s.nextInt();
		p.power(n,pow);
		
	}

}

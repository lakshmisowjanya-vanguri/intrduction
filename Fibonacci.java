import java.util.*;
public class Fibonacci {
	void display(int n) {
	int a=0,b=0,c=1;
	for(int i=0;i<=n;i++) {
		System.out.print(b+" ");
		int d=b+c;
		a=b;
		b=c;
		c=d;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci f=new Fibonacci();
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt();
		f.display(n);
		
	}

}

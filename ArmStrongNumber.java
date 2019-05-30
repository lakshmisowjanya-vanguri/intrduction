import java.util.*;
public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt();
		int n1=n;
		int sum=0;
		while(n>0) {
			int res=n%10;
			sum=sum+(res*res*res);
			n=n/10;
		}
		if(sum==n1) {
			System.out.println("armstrong number");
		}
		else
			System.out.println("not a armstrong number");
			
	}

}

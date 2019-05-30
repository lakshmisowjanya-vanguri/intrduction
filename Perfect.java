import java.util.*;
public class Perfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt();
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(sum==n)
			System.out.println("perfect number");	
		else
			System.out.println("not a perfect number");
	}

}

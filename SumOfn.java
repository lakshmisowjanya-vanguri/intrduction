import java.util.*;
public class SumOfn {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("ente a number");
		int n=s.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		System.out.println("sum of the number is "+sum);
	}

}

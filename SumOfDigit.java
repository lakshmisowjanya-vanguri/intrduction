import java.util.Scanner;
public class SumOfDigit {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt();
		int sum=0;
		while(n>0) {
			int res=n%10;
			sum=sum+res;
			n=n/10;
		}
		System.out.println("sum of number :"+sum);
	}

}

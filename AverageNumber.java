import java.util.*;
public class AverageNumber {
	void average(int a[],int n) {
		double res=0;
		for(int i=1;i<=a.length-1;i++) {
			 res=res+a[i];
		}
		System.out.println("average of a number is :"+res/n);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AverageNumber av=new AverageNumber();
		Scanner s=new Scanner(System.in);
		System.out.println("enter how many elements to calculate average");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("numbers");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		av.average(a,n);
	}

}

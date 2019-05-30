import java.util.*;
public class AverageMarks {
	void calculate(int a[],int n) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println("average marks :"+sum/n);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AverageMarks a=new AverageMarks();
		Scanner s=new Scanner(System.in);
		System.out.println("enter how many subjects");
		int n=s.nextInt();
		int avg[]=new int[n];
		System.out.println("enter marks ");
		for(int i=0;i<avg.length;i++) {
			avg[i]=s.nextInt();		
		}
		a.calculate(avg,n);
	}

}

import java.util.*;
public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n1=s.nextInt();
		System.out.println("enter another number");
		int n2=s.nextInt();
		int i=2,temp,res;
		if(n1>n2)
			res=n1;
		else
			res=n2;
		temp=res;
		while(res%n1!=0||res%n2!=0) {
			res=temp*i;
			i++;
		}
		System.out.println("LCM is :"+res);
		
		
	}

}

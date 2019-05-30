import java.util.*;
public class HCF {
	void hcf(int n1,int n2) {
		while(n2>0) {
			int temp=n2;
			n2=n1%n2;
			n1=temp;
		}
		System.out.println("hcf is "+n1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		HCF h=new HCF();
		System.out.println("enter first number");
		int n1=s.nextInt();
		System.out.println("enter second number");
		int n2=s.nextInt();
		h.hcf(n1,n2);

	}

}

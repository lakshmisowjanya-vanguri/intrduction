import java.util.*;
public class Deprecation {
	void deprecation(int cost,int year,int res) {
		int annual=(cost-res)/year;
		System.out.println(annual);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Deprecation d=new Deprecation();
		
		System.out.println("enter cost");
		int cost=s.nextInt();
		System.out.println("enter how many years u want");
		int year=s.nextInt();
		System.out.println("residual cost");
		int res=s.nextInt();
		d.deprecation(cost,year,res);
	}

}

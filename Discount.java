import java.util.*;
public class Discount {
	void calculate(int cost,double discount) {
		double total=cost*discount/100;
		System.out.println("discount is :"+total);
		double original=cost-total;
		System.out.println("total cost :"+original);		
	}
	public static void main(String[] args) {
		Discount d=new Discount();
		Scanner s=new Scanner(System.in);
		System.out.println("enter cost");
		int cost=s.nextInt();
		System.out.println("enter discount ");
		double discount=s.nextDouble();
		d.calculate(cost,discount);
		
	}
}

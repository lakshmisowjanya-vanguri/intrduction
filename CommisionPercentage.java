import java.util.*;
public class CommisionPercentage {
	void calculate(int cost,int discount) {
		int res=cost*discount/100;
		System.out.println("commision percentage is :"+res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommisionPercentage c=new CommisionPercentage();
		Scanner s=new Scanner(System.in);
		System.out.println("enter cost");
		int cost=s.nextInt();
		System.out.println("enter discount");
		int discount=s.nextInt();
		c.calculate(cost,discount);
	}

}

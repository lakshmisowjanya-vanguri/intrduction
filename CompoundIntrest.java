import java.util.*;
public class CompoundIntrest {
	void intrest(double p,double r,double t) {
		double d=p*Math.pow(1+(r/100),t);
		double tot=d-p;
		System.out.println("compound intrest is :"+tot);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompoundIntrest c=new CompoundIntrest();
		Scanner s=new Scanner(System.in);
		System.out.println("enter principle");
		double p=s.nextDouble();
		System.out.println("enter rate ");
		double r=s.nextDouble();
		System.out.println("enter time ");
		double t=s.nextDouble();
		c.intrest(p,r,t);
	}

}

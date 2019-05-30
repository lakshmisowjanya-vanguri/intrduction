import java.util.*;
public class PerimeterOfTraingle {
	void circle(double r) {
		double c=2*3.14*r;
		System.out.println("perimeter of circle :"+c);
	}
	void rectangle(double l,double w) {
		double r=2*(l+w);
		System.out.println("perimeter of rectangle :"+r);
	}
	void parallelogram(double a,double b) {
		double p=2*(a+b);
		System.out.println("perimeter of parallelogram :"+p);
	}
	void square(double a) {
		double s=4*a;
		System.out.println("perimeter of square :"+s);
	}
	void rhombus(double a) {
		double r=4*a;
		System.out.println("perimeter of rhombus :"+r);
	}
	void equilateralTraingle(double a) {
		double e=3*a;
		System.out.println("perimeter of circle :"+e);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		 System.out.println("enter a number");
		double r=s.nextDouble();
		PerimeterOfTraingle a=new PerimeterOfTraingle();
		 a.circle(r);
		 System.out.println("enter length and width  of  rectangle traingle ");
		 double l1=s.nextDouble();
		 double w=s.nextDouble();
		 a.rectangle(l1,w);
		 System.out.println("enter  bredth  and height of parallelogram triangle ");
		 double b3=s.nextDouble();
		 double h2=s.nextDouble();
		 a.parallelogram(b3,h2);
		 System.out.println(" enter perimeter of a square ");
		 double a3=s.nextDouble();
		 a.square(a3);
		 System.out.println("enter perimeter area of square");
		 double d1=s.nextDouble();
		 a.rhombus(d1);
		 System.out.println("enter area of equilateral traingle");
		 double a1=s.nextDouble();
		 a.equilateralTraingle(a1);
	}

}

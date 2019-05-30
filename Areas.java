import java.util.*;
public class Areas {
 void areaOfCircle(double r) {
	 double n=(3.14*r*r);
	 System.out.println("area of circle is :"+n);
 }
 void traingle( double l,double b) {
	 double t=0.5*(l*b);
	 System.out.println("area of traingle is :"+t);
	 }
 void rectangle( double l, double b) {
	 double r=(l*b);
	 System.out.println("area of rectangle is :"+r);
 }
 void isosceles( double b, double h) {
	double  i= (0.5)*(b*h);
	System.out.println("area of isosceles :"+i);
 }
 void paralleogram(double b,double h) {
	 double p=b*h;
	 System.out.println("area of paralleogram :"+p);
 }
 void rhombus(double d1,double d2) {
	 double z=d1*d2;
	 System.out.println("area of rhombus :"+z);
 }
 void equilateralTraingle(double a) {
	 double e=(Math.sqrt(3))/4*a*a;
	 System.out.println("area of equilateral traingle :"+e);
 }
 public static void main(String k[]) {
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter a number");
	double r=s.nextDouble();
	 Areas a=new Areas();
	 a.areaOfCircle(r);
	 System.out.println("enter length and bredth of traingle  ");
	 double l=s.nextDouble();
	 double b=s.nextDouble();
	 a.traingle(l,b);
	 System.out.println("enter length and bredth of  rectangle traingle ");
	 double l1=s.nextDouble();
	 double b1=s.nextDouble();
	 a.rectangle(l1,b1);
	 System.out.println("enter length and  bredth of isosceles  triangle ");
	 double b2=s.nextDouble();
	 double h=s.nextDouble();
	 a.isosceles(b2,h);
	 System.out.println("enter  bredth  and height of parallelogram triangle ");
	 double b3=s.nextDouble();
	 double h2=s.nextDouble();
	 a.paralleogram(b3,h2);
	 System.out.println("enter diagnoal1 and daigonal2 of rhombus traingle  ");
	 double d1=s.nextDouble();
	 double d2=s.nextDouble();
	 a.rhombus(d1,d2);
	 System.out.println("enter area of equilateral traingle");
	 double a1=s.nextDouble();
	 a.equilateralTraingle(a1);
 }
}

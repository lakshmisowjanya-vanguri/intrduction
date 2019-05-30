import java.util.*;
public class Volume {
	void coneVolume(int r,int h) {
		double c=((3.14*r*r)*3)/4; 
		System.out.println("volume of a cone :"+c);
	}
	void prism(int b,int h) {
		double p=(b*h)/(2*h);
		System.out.println("volume of a prism :"+p);
	}
	void cylinder(int r,int h) {
		double c=3.14*r*r*h;
		System.out.println("volume of a cone :"+c);
	}
	void sphere(int r) {
		double s=(4/3)*(3.414*r*r*r);
		System.out.println("volume of a sphere:"+s);
	}
	void curvedSurface(int a) {
		double d=4*a*a;
		System.out.println("volume of acurved surface of a cube :"+d);
	}
	void totalSurface(int r,int h) {
		double t=(2*3.414*r*r)+(2*3.414*r*h);
		System.out.println("volume of total surface area :"+t);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Volume v=new Volume();
		Scanner s=new Scanner(System.in);
		System.out.println("enter radius and height of volume  cone");
		int r=s.nextInt();
		int h=s.nextInt();
		v.coneVolume(r,h);
		System.out.println("enter bredth  and height of volume prism");
		int b=s.nextInt();
		int h1=s.nextInt();
		v.prism(b,h1);
		System.out.println("enter bredth  and height of volume prism");
		int r1=s.nextInt();
		int h2=s.nextInt();
		v.cylinder(r1,h2);
		System.out.println("enter radius volume of a sphere");
		int r2=s.nextInt();
		v.sphere(r2);
		System.out.println("enter area of volume of curved surface area");
		int a3=s.nextInt();
		v.curvedSurface(a3);
		System.out.println("enter area of volume of total surface area");
		int z=s.nextInt();
		int q=s.nextInt();
		v.totalSurface(z,q);
	}

}

import java.util.*;
public class Distance {
	void distance(int x1,int x2,int y1,int y2) {
		double z= (Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1))/2);
		System.out.println("distance b/w two points is :"+z);
		
	}
	public static void main(String[] args) {
		Distance d=new Distance();
		Scanner s=new Scanner(System.in);
		System.out.println("enter four numbers to calculate distance");
		int x1=s.nextInt();
		int x2=s.nextInt();
		int y1=s.nextInt();
		int y2=s.nextInt();
		d.distance(x1,x2,y1,y2);

	}

}

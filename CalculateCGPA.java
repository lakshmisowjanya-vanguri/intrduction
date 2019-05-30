import java.util.*;

public class CalculateCGPA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum=0,cgpa;
		 CalculateCGPA c=new  CalculateCGPA();
		 Scanner s=new Scanner(System.in);
		 System.out.println("enter number of subjects");
		 int n=s.nextInt();
		 double marks[]=new double[n];
		 System.out.println("enter subject marks");
		 for(int i=0;i<marks.length;i++) {
			 marks[i]=s.nextDouble();
		 }
		 double g[]=new double[n];
		 for(int i=0;i<g.length;i++) {
			 g[i]=marks[i]/10;
		 }
		 for(int i=0;i<n;i++) {
			sum=sum+g[i];
			
		 }
		 cgpa=sum/n;
		 System.out.println("grade is :"+cgpa);
	}

}

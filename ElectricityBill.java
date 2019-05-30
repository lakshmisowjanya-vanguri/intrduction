import java.util.*;
public class ElectricityBill {
	void calculate(int unit) {
		int n =unit*24*30*7/1000;
		System.out.println("total bill is :"+n);
	}
	public static void main(String[] args) {
		 ElectricityBill e=new  ElectricityBill();	 
		Scanner s=new Scanner(System.in);
		System.out.println("enter units of a electricity bill");
		int unit=s.nextInt();
		e.calculate(unit);
		

	}

}

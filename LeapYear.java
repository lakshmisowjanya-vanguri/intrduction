import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt();
		if(n%4==0)
			System.out.println("leap year");
		else
			System.out.println(" not a leap year");
	}

}

import java.util.*;
public class BattingAvg {
	void average(int innings,int runs,int nout) {
		int total=runs/(innings-nout);
		System.out.println("Avrage batting "+total);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BattingAvg b=new BattingAvg();
		Scanner s=new Scanner(System.in);
		System.out.println("enter number of innings");
		int innings=s.nextInt();
		System.out.println("enter Number of runs");
		int run=s.nextInt();
		System.out.println("enter how many matches not out");
		int nout=s.nextInt();
		b.average(innings,run,nout);
	}
}

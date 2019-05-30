import java.util.*;
public class CharacterCount {
	public static void main(String[] args) {
				Scanner s=new Scanner(System.in);
				System.out.println("enter string");
				String str=s.nextLine();
				int l=str.length();
				char ch[]=new char[l];
				for(int i=0;i<l;i++) {
					ch[i]=str.charAt(i);
				}
				for(int i=0;i<l;i++) {
					int count=0;
					for(int j=i+1;j<l;j++) {
						if(ch[i]==ch[j]) {
							ch[j]=ch[l-1]; 
							j--;
							l--;
							count++;
						}
					}
				System.out.println(ch[i]+" : "+" "+(count+1));
				}
			}
		
}
	



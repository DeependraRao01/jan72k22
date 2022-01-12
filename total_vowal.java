package jan7;
import java.util.*;

public class total_vowal {
	public static void main(String[] arg) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str=sc.nextLine();
		String str1=str.toLowerCase();
		char ch1='a';
		char ch2='e';
		char ch3='i';
		char ch4='o';
		char ch5='u';
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		int count5=0;
		
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)==ch1) {
				count1+=1;								
			}
			else if(str1.charAt(i)==ch2) {
				count2+=1;								
			}
			else if(str1.charAt(i)==ch3) {
				count3+=1;								
			}
			else if(str1.charAt(i)==ch4) {
				count4+=1;								
			}
			else if(str1.charAt(i)==ch5) {
				count5+=1;								
			}
			
		}
		System.out.println("Vowal a is : "+count1);
		System.out.println("Vowal e is : "+count2);
		System.out.println("Vowal i is : "+count3);
		System.out.println("Vowal o is : "+count4);
		System.out.println("Vowal u is : "+count5);
		
		
	}

}

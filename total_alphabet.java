package jan7;
import java.util.*;

public class total_alphabet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string : ");
		String str=sc.nextLine();
		
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>=65 && ch<=90 ||ch>=97 && ch<=122){
				count+=1;
			}
		}
		System.out.println(count);

	}

}

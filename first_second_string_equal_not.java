package jan7;

import java.util.Scanner;

public class first_second_string_equal_not {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter first string : ");
		String str1=sc.nextLine();
		
		System.out.println("Enter second string : ");
		String str2=sc.nextLine();
		
		if(str1.equals(str2)) {
			System.out.println("equal");
			
		}
		else {
			System.out.println("Not equal");
		}

	}

}

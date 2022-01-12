package jan7;
import java.util.*;

public class palindrom {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string check palindrome or not");
		System.out.println("With assumin upper & Lower case");
		String a=sc.nextLine();
		char arr[]=a.toCharArray();
		System.out.println(Arrays.toString(arr));
		boolean flag= true;
		for(int i = 0, j = arr.length-1; i<j; i++, j--) {
			if(arr[i] != arr[j]) {
				flag=false;
				break;
			}
		}
		if(flag) {
			System.out.println(a+" "+"is Palindrom");
			
		}
		else {

			System.out.println(a+" "+"is not Palindrom");
		}

	}

}

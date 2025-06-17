//eck if a number is palindrome – 121 → palindrome; 123 → not
import java.io.*;
import java.util.*;
class NumberPalindrome{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int in=sc.nextInt();
		int n=in;
		int reversed=0;
		while(n!=0){
			int digit=n%10;
			reversed=reversed*10+digit;
			n=n/10;
		}
		if(in==reversed){
			System.out.println("Palindrome Number");
		}
		else{
			System.out.println("Not a Palindrome Number");
		}
	}
}
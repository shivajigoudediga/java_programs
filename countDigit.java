//Count digits in a number – Use while loop to divide by 10 and count.
import java.io.*;
import java.util.*;
class CountDigit{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		int count=0;
		while(n!=0){
			n=n/10;
			count++;
		}
		System.out.println("total Digits in a Number:"+count);
	}
}

//Find sum of first N natural numbers – Use loop or formula. 
import java.util.*;
import java.io.*;
public class sum_of_first_natural_numbers{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the N number to find sum");
		int n=sc.nextInt();
		int k=0;
		for(int i=0;i<=n;i++){
			k=k+i;
		}
		System.out.println("sum of first N natural numbers:"+k);
	}
}

//Print multiplication table of a number – e.g., 2 x 1 = 2 to 2 x 10 = 20
import java.io.*;
import java.util.*;
class Multiplication{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Multiplication Table Number");
		int n=sc.nextInt();
		for(int i=1;i<=10;i++){
			int k=n*i;
			System.out.println(n+"x"+i+"="+k);
		}
	}
}

		
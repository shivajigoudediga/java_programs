//Print all even and odd numbers from 1 to N – Use if condition inside loop.
import java.io.*;
import java.util.*;
public class even_odd_from_1toN{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the N numbers to find even or odd");
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			if(i%2==0){
				System.out.println("even numbers are:"+i);
			}
			else{
				System.out.println("odd numbers are:"+i);
			}
		}
	}
}

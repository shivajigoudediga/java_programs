import java.io.*;
import java.util.*;
public class print_N_numbers{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			if(i<=1){
				System.out.println("N_Numbers  from 1 to N are:\n"+i);
			}
			else{
				System.out.println(i);
			}	
		}
	}
}

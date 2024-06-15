package important1;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,n;
		System.out.println("enter value of n");
		Scanner s=new Scanner(System.in) ;
		n=s.nextInt();	
		for(a=1;a<=10;a++) {
			System.out.println(n+"*"+a+"="+(n*a));
		}
	}

}

package triangle;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("please input a:");
		double a=sc.nextDouble();
		System.out.print("please input b:");
		double b=sc.nextDouble();
		System.out.print("please input c :");
		double c=sc.nextDouble();
	
		if (a+b<=c) {
			System.out.print("no1");
			return;
			
		}
		if (b+c<=a) {
			System.out.print("no2");
			return;
			
		}
		if (c+a<=b) {
			System.out.print("no3");
			return;
			
		}
		System.out.print("yes");
		
	}

}

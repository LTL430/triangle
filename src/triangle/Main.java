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
		if (a+b>c && b+c>a && c+a>b) {
			System.out.print("yes");
		} else {
			System.out.print("no");
		}
	
	
	}

}

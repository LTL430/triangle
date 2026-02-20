package triangle;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("please input a:");
		double a = sc.nextDouble();
		System.out.print("please input b:");
		double b = sc.nextDouble();
		System.out.print("please input c :");
		double c = sc.nextDouble();
		if ((a==90 || b==90 || c==90) && a+b+c==180) {
			System.out.print("recteangle");
		}
		if (a+b+c==180 && a!=90 && b!=90 && c!=90) {
			System.out.print("triangle");
		}
		if (a+b+c!=180) {
			System.out.print("error");
		}
		
	}

}

package lib;

import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number :");
		int a=sc.nextInt();
		if(a%2==0) {
			a=a-1;
		}
		for(int i=1;i<a;i++) {
			System.out.print((i*2)-1 +",");
		}
		System.out.print((a*2)-1);
	}
}

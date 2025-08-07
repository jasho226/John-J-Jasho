package lib;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of values: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=1;i<=n;i++) {
			System.out.print("Enter the "+i+" value :");
			a[i-1]=sc.nextInt();
		}
		
		Map<Integer,Integer> res=new LinkedHashMap<>();
		
		for(int i=1;i<10;i++) {
			res.put(i, 0);
		}
		for(int i:a) {
			for(int j=1;j<10;j++) {
				if(i%j==0) {
					res.put(j,res.get(j)+1);
				}
			}
		}
		System.out.print(res);
	}

}

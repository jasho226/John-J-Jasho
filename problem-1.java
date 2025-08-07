package lib;

import java.util.Scanner;

public class Calculator {
		 public static void add(double a,double b) {
			 System.out.print(a+b);
		 }
		 public static void sub(double a,double b) {
			 System.out.print(a-b);
		 }
		 public static void mul(double a,double b) {
			 System.out.print(a*b);
		 }
		 public static void div(double a,double b) {
			 System.out.print(a/b);
		 }
		 
		 public static void main(String []args) {
			 Scanner sc=new Scanner(System.in);
			 System.out.print("Enter the first number:");
			 double a=sc.nextDouble();
			 System.out.print("Enter the second number:");
			 double b=sc.nextDouble();
			 
			 System.out.print("Enter the mode of operation : +,-,*,/");
			 String s=sc.next();
			 sc.close();
			
			
			 if(s.equals("+")) {
				 Calculator.add(a, b);
			 }
			 else if(s.equals("-")) {
				 Calculator.sub(a, b);
			 }
			 else if(s.equals("*")) {
				 Calculator.mul(a, b);
			 }
			 else if(s.equals("/")){
				 Calculator.div(a, b);
			 }
			 else {
				 System.out.print("Enter the valid operator");
			 }
			}
			
			
			 
			 }



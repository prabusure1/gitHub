package Polymohrpism;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo1 obj= new Demo1();
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the values");
		
		int a, b,c,d;
		
		a=(int) sc.nextDouble();
		b=sc.nextInt();
	
		System.out.println("Value of a ="+a);
		System.out.println("Value of b= "+b);
		
		
		obj.add(a, b);
		obj.sub(a, b);
		
		sc.close();
		
		
		}
	
	
	public int add (int a, int b)
	{
		
		int c=a+b;
		System.out.println("Total addition value is "+c);
		return c;
		
	}
	
	public double sub (double a, int b)
			
			
	{
		
		double d=a-b;
		System.out.println("Total value of multiplicaion is "+d);
		return d;
		
	}


}

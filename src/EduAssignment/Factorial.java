package EduAssignment;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the number for factorial");
				
		int number=sc.nextInt();
		
		int fact=1;
		for(int i=number;i>0;i--)
		{
			fact=fact*i;
			
			
		}
		
		System.out.println("Factorial number is: "+fact);
	}

}

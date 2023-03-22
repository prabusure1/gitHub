package EduAssignment;

import java.util.Scanner;

public class ReverseDigits {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the digits to reverse");
	
	int n=sc.nextInt();
	int rev=0;
	
	while(n!=0)
	{
		int digit=n%10;
		System.out.print(digit);
		rev=rev*10+digit;
		n/=10;
	}
	System.out.println();
	
	System.out.println("Reversed "+rev);
	
	}

}

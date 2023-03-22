package Strings;

import java.util.Scanner;

public class StringPalindrome {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a string to check whether Palindrome");
		
		String st=sc.nextLine(); //madam
				
		System.out.println("Entered String is: "+st);
		
		String up="",rev="";
					
		for (int i=st.length()-1;i>=0;i--)
		{
			rev=rev+st.charAt(i);
			
			up=rev.toUpperCase();
		}
		
		if (rev.equalsIgnoreCase(st))
		
			System.out.println("Given string "+up+" is a Palindrome");
			
			else
				System.out.println("Given string "+up+" is not a Palindrome");
			
		}

	}





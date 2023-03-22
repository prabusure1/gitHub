package Strings;

import java.util.Scanner;

public class ReverseString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a string to reverse");
		
		String st=sc.nextLine();
		
		char [] ch=st.toCharArray();
		
		for (int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
			
			
		}

	}



}

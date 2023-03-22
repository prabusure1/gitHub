package Strings;

import java.util.Scanner;

public class ReverseString2Builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a string to reverse");
		
		String st=sc.nextLine();
		
	StringBuilder sb= new StringBuilder(st); 
		
		//sb.append(st); // append a string into StringBuilder sb
		
		sb.reverse(); //reverse StringBuilder sb
		System.out.println(sb);
		
	
	}



}

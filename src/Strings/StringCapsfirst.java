package Strings;

import java.util.Scanner;

public class StringCapsfirst {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter string and Print first letter in Caps");
		
		String st=sc.nextLine(); //madam
				
		System.out.println("Entered String is: "+st);
		
		String str[]=st.split(" ");
		
		String cap, cap2;
					
		for (int i=0;i<str.length;i++)
		{
			cap=str[i].toUpperCase().substring(0,1);
			
			cap2=cap+str[i].substring(1,str[i].length());
			
			System.out.println(cap2);
			
		}
		
			
		
		
		
			
		}

	}





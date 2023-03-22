package Strings;

import java.util.Scanner;

public class PrintDupWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a string to find duplicates");
		
		String st=sc.nextLine(); //Welcome to Java Class to learn Java
		
		st.toLowerCase();
		
		String [] starr=st.split(" ");
		
		int count;
		
		for (int i=0;i<starr.length;i++)
		{
			count =1;
			//System.out.println(starr[i]);
			for (int j=i+1;j<starr.length;j++)
			{
				if(starr[i].equals(starr[j]))
						{
							count++;
							
							//starr[j]="0";
						}
				
				if (count<=1 && starr[j]=="0")
				{
					System.out.println("The non repeated words are "+starr[j]);
				}
												
			}
			
			if (count>1 && starr[i]!="0")
			{
				System.out.println(starr[i]);
			}
			
			
		}
		
		

	}



}

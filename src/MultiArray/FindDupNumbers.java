package MultiArray;

import java.util.Arrays;

import java.util.Scanner;

public class FindDupNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner sc =new Scanner (System.in);
		
		System.out.println("Enter size of an array");	
		
		int a=sc.nextInt();
		
		int b[]=new int [a];
		
		System.out.println("Enter values");	
		
		for (int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		
		System.out.println("Contents of the array are: "+Arrays.toString(b));
		
		int large=b[0];
		
		for (int j=1;j<b.length;j++)
		{
			if(b[j]>large)
				
				large=b[j];
			
			
			
		}
		
		System.out.println("Largest number is "+large);

		
		}
	
	
	

}

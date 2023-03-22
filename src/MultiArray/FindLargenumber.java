package MultiArray;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindLargenumber {

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
				
		Set<Integer> s = new HashSet<Integer>();
		
		
		for (int j=0;j<b.length;j++)
		{
			if(s.add(b[j])==false)
			{
				System.out.println("Duplicate element at "+j+" is "+b[j]);
			
									
			}
			

		}
		
		
		
	
		
		}
	
	
	

}

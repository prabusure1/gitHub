package MultiArray;

import java.util.Arrays;

import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row, column;
		
		Scanner sc =new Scanner (System.in);
		
		System.out.println("Enter number of rows");		
		
		row=sc.nextInt();
		int r[]=new int [row];
		
		System.out.println("Enter number of Columns");	
		
		column = sc.nextInt();
		int c[]=new int [column];
		
		System.out.println("Enter rows values");
		
		int i,j;
		
		for ( i =0;i<=r.length-1;i++)
		{
			r[i]=sc.nextInt();
			
		}
		System.out.println("Enter column values");
		for ( j=0;j<=c.length-1;j++)
		{
			c[j]=sc.nextInt();
		}
		
		System.out.println("Contents of the array are: "+Arrays.toString(r)+Arrays.toString(c));
		
		
		}
	
	
	

}

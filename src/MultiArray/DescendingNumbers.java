package MultiArray;

import java.util.Scanner;

public class DescendingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter size of an array");
		
		int num=sc.nextInt();
		
		int arr[]=new int [num];
		
		int  ascen=0;
		
		System.out.println("Enter numbers to check largest number");
		
		for ( int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
			
		}
		
		for (int i=0;i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				if (arr[i]>arr[j])
				{
					ascen=arr[i];
					arr[i]=arr[j];
					arr[j]=ascen;
					//System.out.print(arr[j]+",");	
				}
			}
		}
		System.out.print("Ascending numbers are: ");
		for (int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+",");	
		}
			
	
		
		

	}

}

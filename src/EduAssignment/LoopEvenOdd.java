package EduAssignment;

public class LoopEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean bb =true;
		
		System.out.println("Print 10 Even and 10 Odd numbers");
		
		for (int i=1;i<=20;i++)
		{
			if (i%2==0)
			System.out.println("Even numbers are "+i);
		}
		
		System.out.println();
		
		for (int i=0;i<=20;i++)
		{
			if (i%2==1)
			System.out.println("Odd numbers are "+i);
		}

	}

}

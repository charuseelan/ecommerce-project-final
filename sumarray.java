package task2;

import java.util.Scanner;

public class sumarray {

	public static void main(String args[])
	{
		int a[]=new int[50];
		Scanner ab= new Scanner(System.in); 
		System.out.println("enter the size of array ");
		int size=ab.nextInt();
		System.out.println("enter the vslue of array ");
		for(int i=0;i<size;i++)
		{
			a[i]=ab.nextInt();
		}
		int c=0;
		for(int i=0;i<=size;i++)
		{
		 c= c+a[i];
		}
		System.out.println("sum  of array "+c);
		
		
	
	}
	
	
	

}

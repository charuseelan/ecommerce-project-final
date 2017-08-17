package task2;

import java.util.Scanner;

public class remove_array {
public static void main (String args[])
{
	int a[]=new int[50];
	
	System.out .println("enter the size of array ");
	Scanner ab= new Scanner (System .in);
	int size =ab.nextInt();
	System.out.println("the array value is ");
	for(int i=0;i<size;i++)
	{
		a[i]=ab.nextInt();
	}
	System.out.println("the values are :");
	for(int i=0;i<size;i++)
	{
		System.out.println(+a[i]);	
	}
	System.out.println("enter the element to be removed:");
	int get=ab.nextInt();
	for(int i=0;i<size;i++)
	{
		if(a[i]==get)
		{
			for(int j=i;j<size;j++)
			{
				a[j]=a[j+1];
				
			}
			System.out.println("after removed");
			for(int j=0;j<size-1;j++)
			{
				System.out.println(+a[j]);
			}
		}
	}
	
}
}

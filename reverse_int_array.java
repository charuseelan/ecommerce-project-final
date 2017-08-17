package task2;

import java.util.Scanner;

public class reverse_int_array {
	public static void main(String args[])
	{
		int a[]=new int[50];
		int b[]=new int[50];
		System.out.println("enter the size of an array ");
		Scanner ab=new Scanner(System.in);
		int size=ab.nextInt();
		System.out.println("enter the number to be reversed");
		for(int i=0;i<size;i++)
		{
			a[i]=ab.nextInt();
		}
		int count=0;
		System.out.println("reverse array is ");
		for(int i=size-1; i>=0; i--)
		{
			b[count]=a[i];
			
			System.out.println(b[count]);
			count++;
		}
	
	}
	}



package task2;

import java.util.Scanner;

public class duplicate_array {
public static void main(String args[])
{
	int a[]=new int[50];
	System.out.println("enter the size of the integer array :");
	Scanner ab= new Scanner(System.in);
	int size =ab.nextInt();
	System.out.println("enter the array value:");
	for(int i=0;i<size;i++)
	{
		a[i]=ab.nextInt();
		
	}int count=0;
	for(int i=0; i<size; i++)
	{
		 for(int j=i+1;j<size;j++)
		 {
			 if( a[i]==a[j])
			 {
				 System.out.println("the duplicate in the array is" +a[i]);
				 System.out.printf("\nThe duplicate %d is present in locations %d and %d",a[i],i,j);
			 }
			 count++;
		 }
	 
	}
}

}

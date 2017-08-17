package task2;

import java.util.Scanner;

public class sortingarray {
     public static void main (String args[])
     {
    	 System.out.println("enter the size of array ");
    	 Scanner ab =new Scanner(System.in);
    	 int size=ab.nextInt();
    	 int a[]=new int[50];
    	 System.out.println("enter the value of array:");
    	 for(int i=0;i<size;i++)
    	 {
    		 a[i]=ab.nextInt();
    	 }System.out.println("the array element are:");
    	 for(int i=0;i<size;i++)
    	 {
    		 System.out.print(a[i]);
    	 }
    	 for(int i=0;i<size;i++)
    	 {
    		 for(int j=i+1;j<size;j++)
    		 {
    			 if(a[i]>a[j])
    			 {
    				 int temp=a[i];
    				 a[i]=a[j];
    				 a[j]=temp;
    			 }
    		 }
    	 }
    	 System.out.println("\nAfter sorting Array");
    	 System.out.println("");
    	 for(int i=0;i<size;i++)
    	 {
    		 System.out.print(" "+a[i]);
    	 }
     }
}

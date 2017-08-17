package task2;

import java.util.Arrays;

public class sort_string_array {

	public static void main(String args[])
	{
		String str []= {"Charu","Avinash","Barath","Murugan","Ilangovan"};
		System.out.println("The values in array are:");
		
		for(int i=0;i<str.length; i++)
		{
			System.out.println(str[i]);
		}
	Arrays.sort(str);
		System.out.println("\n sorting of the string\n");
		for(int i=0;i<str.length; i++)
		{
			System.out.print(" "+str[i]);
		}
	}
		
		
	}

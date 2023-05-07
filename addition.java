//Addition of a given array

import java.util.Scanner;

public class addition
{
	public static void main(String[] args) 
	{
		int[] a=new int[5];

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter 5 Elements");

		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();  //just read the int value for satring 0 to a.length  and it read at a time only one value
		}

			int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of Array is:"+sum);
		
	}
}

/*
Enter 5 Elements
5
4
3
2
1
Sum of Array is:15

*/
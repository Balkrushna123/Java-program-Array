import java.util.Scanner;

public class A3
{
	public static void main(String[] args) 
	{
		int [] a=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 Elements");

		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}

		System.out.println("The User Entered a arry");

		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}
}
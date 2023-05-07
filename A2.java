// array index starting from 0
//array count is starting from 1

public class A2
{
	public static void main(String[] args) 
	{
		int[] a=new int[10];// first way of array creation
		
		// int[] a={5,10,15,20,25,30};//second way of array creation

		a[0]=5;
		a[1]=10;
		a[2]=15;
		a[3]=20;
		a[4]=25;
		a[5]=30;

		for(int i=0;i<a.length;i++)  //a.length is find the length of array
		{
			System.out.println(a[i]);
		}
		
	}
}
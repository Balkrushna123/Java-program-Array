//to check the number is present in which array of index 

public class A4
{
	public static void main(String[] args) 
	{
		int[] a={5,10,15,20,25,30};

		int num=20;

		int index=findIndexOfElementInArray(a,num); //function calling 11 no line to direct 23 no line

		if(index==-1)  // to check the number is equal or not
		{
			System.out.println("Not found");
		}
		else
		{
			System.out.println("found at index:"+index);
		}
		
	}
	public static int findIndexOfElementInArray(int[] a,int num)  
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)  // to check the num==a[i] 
				return i;
		}
		return -1;
	}
}

/*

found at index:3

*/
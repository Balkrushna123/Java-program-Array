//to check the same number in array list

public class A5
{
	public static void main(String[] args) 
	{
		int[] a={5,10,15,20,25,20}; 
		int num=20;

		findIndexOfElementInArray(a,num);
	}
	public static void findIndexOfElementInArray(int[] a,int num)
	{
		int counter=0;

		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
			{
				counter++;
				System.out.println("Found at index:"+i);
			}
		}
		if(counter==0)  //not enter in a loop the it will be executed
		{
			System.out.println("Not found");
		}
	}
}

/*

Found at index:3
Found at index:5

*/
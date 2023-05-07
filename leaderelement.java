//print LEADER elemets for given array

public class leaderelement
{
	public static void main(String[] args) 
	{
		int[] a={11,22,99,33,44,88,55,77,66}; //note=array last element is always leader element

		for(int i=0;i<a.length;i++)
		{
			int counter=0;  //it count the leader element of right side 
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]>a[i])  //the given element (a[j]>a[i]) is greater than the a[i] element 
				{
					counter++;
				}
			}
			if(counter==0)// counter is 0 then the given number is leader number
			{
				System.out.print(a[i]+" ");
			}
		}
		
	}
}

/*

99 88 77 66

*/
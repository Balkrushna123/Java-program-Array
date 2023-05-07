//the all negative number sort the right side of array and positive number is left side
//with condition even odd
//sorting array even and odd ...left side odd number and right side even number

public class evenoddrange
{
	public static void main(String[] args) 
	{
		int[] a={12,-22,33,-44,56,-66,77,-88,99};

		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]%2==0 && a[j]%2!=0)  //check number is even or odd
					{
						int temp=a[i];  //swap the variable
						a[i]=a[j];
						a[j]=temp;
					}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}	
	}
}

/*

33 77 99 -44 56 -66 -22 -88 12

*/
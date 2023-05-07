//the all negative number sort the right side of array and positive number is left side
//without even odd condition 
public class evenoddrange
{
	public static void main(String[] args) 
	{
		int[] a={12,-22,33,-44,56,-66,77,-88,99};

		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<0 && a[j]>0)  
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


*/
/*

12 33 56 77 99 -66 -44 -88 -22
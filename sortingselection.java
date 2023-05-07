//sorting array for selection for find in min selection sort
public class sortingselection
{
	public static void main(String[] args) 
	{
		int[] a={11,55,22,99,33,88,66,77};

		for(int i=0;i<a.length;i++)
		{
			int min=i;  //decalre min==i 
			for(int j=i+1;j<a.length;j++)  //i+1 means j always start with i+1 mens i ke next iteration che chalu hoga
			{
				if(a[j]<a[min]) //j is less tahn min the condition is true and j=min means j min ke barabar hoga
					min=j;
			}
			int temp=a[i]; //swapping method
			a[i]=a[min];
			a[min]=temp;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}	
	}
} 

/*

11 22 33 55 66 77 88 99

*/
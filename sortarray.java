//sorting array using swapping methgod

public class sortarray
{
	public static void main(String[] args) 
	{
		int[] a={11,55,22,99,33,88,66,77};

		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)  //or for(int j=i+1;j<a.length;i++) the use this method
			{
				if(i<j && a[i]>a[j])  //or if(a[i]>a[j]) then use this metehod
				{
					int temp=a[i];
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

11 22 33 55 66 77 88 99

*/
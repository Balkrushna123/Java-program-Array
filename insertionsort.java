
public class insertionsort 
{

	public static void main(String[] args) 
	{
		int []a ={11,44,33,22,55,47};

		for(int i=1;i<a.length;i++)  // i should start with the 1
		{
			int temp=a[i];  //store original value of a[i] in temp
			int j=i;
			for(;j>0;j--) 
			{
				if(a[j-1]>temp) // to check the number is greater than temp
				{
					a[j]=a[j-1];
				}
				else
				{
					break;
				}
			}
			a[j]=temp;
		}
		//System.out.println(Arrays.toString(a));//no need to for loop for print the array
		//object la print karayala toSting method use karato
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}
}

/*

11 22 33 44 47 55

*/

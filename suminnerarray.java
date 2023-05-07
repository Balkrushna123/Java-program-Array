//addition of inner array 
public class suminnerarray
{
	public static void main(String[] args) 
	{
		int[][] a={
			{1,2,4,4,2,1},
			{4,2,1,5,6,7},
			{1,4,9,8,5,6},
		    {5,8,6,9,7,8}};

			int sum=0;
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
					if(i!=0 && i!=3 && j!=0 && j!=5)
						sum=sum+a[i][j];
				}
			}
			System.out.println("sum of inner array:"+sum);
	}
}

/*

sum of inner array:40

*/
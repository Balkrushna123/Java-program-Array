//Two (2D) Array
public class ex2d1
{
	public static void main(String[] args) 
	{
		int[][]a={  //int[][] means two 2d array
			{1,2,4},
			{4,2,9},
			{1,4,9}};

			for(int i=0;i<a.length;i++)
			{
				int[]b=a[i]; //means a[i] is single array and copy of one by one element 

				for(int j=0;j<a.length;j++)
				{
					System.out.print(b[j]+" "); //b[j] print one by one element
				}
				System.out.println();
			}
	}
}

/*

1 2 4
4 2 9
1 4 9

*/
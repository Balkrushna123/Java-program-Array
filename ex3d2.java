public class ex3d2
{
	public static void main(String[] args) 
	{
		int[][]a={  //int[][] means two 2d array
			{1,2,4},
			{4,2,9},
			{1,4,9}};

			for(int i=0;i<a.length;i++)
			{

				for(int j=0;j<a[i].length;j++)
				{
					System.out.print(a[i][j]); 
				}
				System.out.println();
			}
	}
}

/*

124
429
149

*/

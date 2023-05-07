//multiplication of matrix 3 by 3 matrix

//a[i]=row
//b[i]=column
public class multiplytwomatrix
{
	public static void main(String[] args) 
	{
		int[][] a={{1,2,4},{4,2,1},{5,6,7}};

		int[][] b={{2,4,5},{8,6,9},{6,2,5}};

		int[][] c=new int[a.length][a.length];//c chi length a.length aahe same

		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				for(int k=0;k<b.length;k++)
				{
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}

/*

42 24 43
30 30 43
100 70 114

*/
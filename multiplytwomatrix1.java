//multiplication of matrix 2 by 3 matrix

//a[i]=row
//b[i]=column
public class multiplytwomatrix1
{
	public static void main(String[] args) 
	{
		int[][] a={{1,2,4},{4,2,1}};

		int[][] b={{2,4},{8,6},{6,2}};

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

42 24
30 30

*/
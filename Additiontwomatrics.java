//addition of two matrix
public class Additiontwomatrics
{
	public static void main(String[] args) 
	{
		int[][] a={{1,2,4},{4,2,1},{5,6,7}};

		int[][] b={{2,4,5},{8,6,9},{6,2,5}};

		int[][] c=new int[3][3]; //create new aaray c[i][j] and a[i][j] and b[i][j] length area same for addition of matrix
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];//addition of two matrix 
			}
		}
		for(int i=0;i<c.length;i++)
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

3 6 9
12 8 10
11 8 12

*/
import java.util.Arrays;
public class Massintervelivingarray
{
	public static void main(String[] args) 
	{
		char[] a={'a','b','c','d'};
		char[] b={'w','x','y','z'};

		char[] c=new char[a.length+b.length]; //c length is 8

		int index=0;

		for(int i=0;i<a.length || i<b.length;i++)
		{
			if(i<a.length)
			{
				c[index]=a[i];
				index++;
			}
			if(i<b.length)
			{
				c[index]=b[i];
				index++;
			}
		}
		System.out.println(Arrays.toString(c));//import package java.util.Arrays
		
	}
}

/*

[a, w, b, x, c, y, d, z]

*/
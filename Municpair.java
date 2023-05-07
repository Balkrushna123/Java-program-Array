
import java.util.Arrays;
public class Municpair
{
	public static void main(String[] args) 
	{
		int[] a={1,2,1};

		int uniqueElementcnt=0; //find unique element count
		for(int i=0;i<a.length;i++)
		{
			int cnt=0;  //find duplicate count
		
		for(int j=0;j<i;j++)
		{
			if(a[i]==a[j])
			{  //find the element is same or not 
				cnt++; //then the element is same then cnt++ is execute
			}
		} 
		
		if(cnt==0)
			uniqueElementcnt++; //if the count is 0 the the unique count is ++
	}
	int[] c=new int[uniqueElementcnt];  //new array is create ((uniqueElementcnt--is the length of array c)
	int index=0;

	for(int i=0;i<a.length;i++)
	{
		int cnt=0;
		for(int j=0;j<i;j++)
		{
			if(a[i]==a[j])
				cnt++;
		}
		if(cnt==0)
		{
			c[index++]=a[i]; 
		}
	}
	a=c;  //c array is store in a a

	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length;j++)
		{
			System.out.println(a[i]+" "+a[j]);
		}
	}
  }
}

/*

1 1
1 2
2 1
2 2


*/
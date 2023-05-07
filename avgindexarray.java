//assignment no31

public class avgindexarray
{
	public static void main(String[] args) 
	{
		int[] a={5,7,90,20,5,50,40};
		 //      i  start with this index
		 //      j  start with this index
		 //      k start with first three element in the array  (k means the sum of first three elements in th array ex(5+7+90),(7+90+20))etc

		int k=3;
		int min=Integer.MAX_VALUE;
		int minIndex=0;

		for(int i=0;i<a.length-k+1;i++) //i and j start with same index
		{
			int sum=0;
			for(int j=i;j<i+k;j++)  //last index of array is k+1 
			{
				sum=sum+a[j];
			}
			int avg=sum/k;  //avg of sub array and divide by k
			if(avg<min)
			{
				min=avg;
				minIndex=i; //value of index number is copy on minIndex 
			}
		}
		System.out.println("minimum avg of array is:"+min);
		System.out.println("min avg of index number is :"+minIndex);
		
	}
}

/*

minimum avg of array is:25
min avg of index number is :3

*/
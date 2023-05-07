public class Msubarray
{
	public static void main(String[] args) 
	{
		int[] a={3,7,90,20,5,50,40};

		//int j=3;
		int minAvg=Integer.MAX_VALUE;
		int startIndex=0;

		for(int i=0;i<=a.length-3;i++)  //we replace 3 value in j
		{
			int sum=0;
			for(int k=i;k<i+3;k++)  //int k is already decalre in rhe line no 7
			{
				sum=sum+a[k];
			}
			int avg=sum/3;  //we replace 3 value in j
			if(avg<minAvg) //find minmum value
			{
				minAvg=avg;
				startIndex=i; //index start with 0 
			}
		}
		System.out.println("avg of subarray is: "+minAvg);
		System.out.println("found in subarray in index:"+ startIndex);
		
	}
}

/*

avg of subarray is: 25
found in subarray in index:3

*/
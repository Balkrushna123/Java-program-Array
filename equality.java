//check equality or compare array is same or not of array
public class equality
{
	public static void main(String[] args) 
	{
		int[] a={10,20,30,40,50};
		int[] b={10,20,30,40,50};

		String result=checkEqualityOfArray(a,b);

		System.out.println(result);
	}

		private static String checkEqualityOfArray(int[] a,int[] b) // comparing array is same or not
		{
			if(a==null && b==null)
				return "Both are not Same,null";
			if(a==null && b!=null)
				return "Not same";
			if(a!=null && b==null)
				return "Not same";
			if(a.length!=b.length)
				return "Not same for length";

			for(int i=0;i<a.length;i++)
			{
				if(a[i]!=b[i])
					return "Not same";
			}
			return "Same";

		} 		
}

/*
Same
*/
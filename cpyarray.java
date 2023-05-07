// copy of array 
public class cpyarray
{
	public static void main(String[] args) 
	{
		int[] a={5,10,51,20,25,30}; //original object

		int[] b=new int[a.length];  //copy of object with new object creation

		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		b[1]=100;  //only change in the second object b but no change in array of a

		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
			System.out.println();

		}
		System.out.println("end first loop");

		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]+" ");
			System.out.println();

		}
		
	}
}

/*
5

10

51

20

25

30

end first loop
5

100  //only change in this posiyion

51

20

25

30


*/
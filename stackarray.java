public class stackarray
{

   public static void main(String[] args) 
	{
		stack stack=new stack();

		stack.push(10);
		stack.push(10);

		stack.pop();
		stack.print();
		
	}
}

public class stack
{
	private int [] a=new int[5];
	private int p=0;

public void print()
		{
			for(int i=0;i<p;i++)
			{
				System.out.print(a[i]+" ");
				System.out.println();
			}
		}


		public void push(int num)
		{
			if(p>=a.length)
			{
				System.out.println("Stack is full");
			}
			else
			{
				a[p]=num;
				p++;
			}
		}

		public int pop()
		{
			if(p==0)
			{
				System.out.println("Stack is empty");
				return 0;
			}
			else
			{
				p--;
				return a[p];
			}
		}
		
	}

	/*

	10

	*/+
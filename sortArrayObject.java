//sorting of array of objects
public class sortArrayObject
{
	public static void main(String[] args) 
	{
		Student s1=new Student(1,"somu",40);
		Student s2=new Student(2,"gomu",41);
		Student s3=new Student(3,"somya",39);
		Student s4=new Student(4,"gomya",38);

		Student[] s={s1,s2,s3};//create student array 
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].marks>s[j].marks);//ascending order sort objects
				{
					Student temp=s[i]; //swapping
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i].id+" "+s[i].name+" "+s[i].marks); //s[i] means point to address and print the value of adress or index
		}
		
	}
}

public class Student //second class
{
	int id;
	String name;
	int marks;

	public Student(int id,String name,int marks) //constructor create
	{
		super();  //call for ArrayOfObject class
		this.id=id;  //this keyword means call for a Student class means this class
		this.name=name;
		this.marks=marks;
	}
}

/*

3 somya 39
2 gomu 41
1 somu 40

*/